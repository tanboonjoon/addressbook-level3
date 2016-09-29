package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public interface IStorageFile {
	
	
	 public void save(AddressBook addressBook) throws StorageOperationException, seedu.addressbook.storage.StorageStub.StorageOperationException;
	 
	 public AddressBook load() throws StorageOperationException, seedu.addressbook.storage.StorageStub.StorageOperationException;
	 
	 public String getPath();
	 
	 

}
