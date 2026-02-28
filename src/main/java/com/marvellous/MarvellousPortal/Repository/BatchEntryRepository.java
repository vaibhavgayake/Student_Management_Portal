package com.marvellous.MarvellousPortal.Repository;

import com.marvellous.MarvellousPortal.Entiy.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, ObjectId>
{

}
