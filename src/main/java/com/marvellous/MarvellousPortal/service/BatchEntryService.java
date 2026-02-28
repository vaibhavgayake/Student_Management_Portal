package com.marvellous.MarvellousPortal.service;

import com.marvellous.MarvellousPortal.Entiy.BatchEntry;
import com.marvellous.MarvellousPortal.Repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryrepository;

    // C : Creat
    // POST : http verb
    public void saveEntry(BatchEntry batchEntry)
    {
        batchEntryrepository.save(batchEntry);
    }

    // R : read
    // GET
    public List<BatchEntry> getAll()
    {
        return batchEntryrepository.findAll();
    }

    //R : read
    //GET
    public Optional<BatchEntry> findById(ObjectId id)
    {
        return batchEntryrepository.findById(id);
    }

    // D : delete
    // DELETE
    public void deleteById(ObjectId id)
    {
        batchEntryrepository.deleteById(id);
    }

    // U : Update
    // update()
    //    public void updateById(ObjectId id)
    //    {
    //        batchEntryrepository.updateById(id);
    //    }
}
