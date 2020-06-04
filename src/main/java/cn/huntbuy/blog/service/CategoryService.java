package cn.huntbuy.blog.service;

import cn.huntbuy.blog.dao.CategoryDao;
import cn.huntbuy.blog.domain.Category;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryService {
    @Resource
    CategoryDao categoryDao;

    public List<Category> list() {
        return categoryDao.findAll();
    }

    public Category get(int id) {
        return categoryDao.findById(id);
    }
}