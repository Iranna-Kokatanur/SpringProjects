import React from 'react'

const CategoryFilter = ({categories, onSelect}) => {
  return (
    <div className='row'>
          <select className='form-control' onChange={e => onSelect(e.target.value)}>
              <option value=''>All Categories</option>
              {
                  categories.map(category => (
                    <option value={category.id} key={category.id}>{category.name}</option>
                  ))
              }
             </select>
    </div>
  )
}

export default CategoryFilter
