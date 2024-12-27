package com.example.invoice.controller;

import com.example.invoice.model.Invoice;
import com.example.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    Environment env;

    @GetMapping("/")
    public String home() {
        return "homeView";
    }

    @GetMapping("/addInvoice")
    public String addInvoiceForm(Model model) {
        model.addAttribute("invoice", new Invoice());
        return "add-invoice";
    }

    @PostMapping("/saveInvoice")
    public String saveInvoice(@ModelAttribute("invoice") Invoice invoice, Model model) {
        try {
            Invoice savedInvoice = invoiceService.saveInvoice(invoice);
            model.addAttribute("message", "Invoice with id: '" + savedInvoice.getId() + "' is added successfully!");
            return "add-invoice";
        } catch (Exception e) {
            throw new RuntimeException("Error saving invoice", e);
        }
    }

    @GetMapping("/listInvoices")
    public String listInvoices(Model model) {
        try {
            model.addAttribute("invoices", invoiceService.getAllInvoices());
            return "list-invoices";
        } catch (Exception e) {
            throw new RuntimeException("Error listing invoices", e);
        }
    }

    @GetMapping("/editInvoice/{id}")
    public String editInvoiceForm(@PathVariable Long id, Model model) {
        try {
            Invoice invoice = invoiceService.getInvoiceById(id);
            model.addAttribute("invoice", invoice);
            return "edit-invoice";
        } catch (Exception e) {
            throw new RuntimeException("Error editing invoice", e);
        }
    }

    @PostMapping("/updateInvoice")
    public String updateInvoice(@ModelAttribute("invoice") Invoice invoice, Model model) {
        try {
            Invoice updatedInvoice = invoiceService.saveInvoice(invoice);
            model.addAttribute("message", "Invoice with id: '" + updatedInvoice.getId() + "' is updated successfully!");
            return "edit-invoice";
        } catch (Exception e) {
            throw new RuntimeException("Error updating invoice", e);
        }
    }

    @GetMapping("/deleteInvoice/{id}")
    public String deleteInvoice(@PathVariable Long id, Model model) {
        try {
            invoiceService.deleteInvoice(id);
            model.addAttribute("message", "Invoice with id: '" + id + "' is deleted successfully!");
            return "redirect:/listInvoices";
        } catch (Exception e) {
            throw new RuntimeException("Error deleting invoice", e);
        }
    }
}
