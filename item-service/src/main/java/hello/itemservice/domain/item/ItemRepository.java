package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Repository
public class ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>();   //static
    private static Long sequence = 0L;  //static

    public Item save(Item item) {

        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {

        return store.get(id);
    }

    public List<Item> findAll() {

        return new ArrayList<>(store.values());
    }

    public void update(Long itemId, Item updatedParam) {

        Item findItem = findById(itemId);

        findItem.setItemName(updatedParam.getItemName());
        findItem.setPrice(updatedParam.getPrice());
        findItem.setQuantity(updatedParam.getQuantity());
    }

    public void clearStore() {

        store.clear();
    }
}
