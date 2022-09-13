package guru.springframework.myversionofpetclinic.service;

import guru.springframework.myversionofpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
