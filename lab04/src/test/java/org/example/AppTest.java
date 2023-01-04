package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import org.example.BSTNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class AppTest {
    Map<Integer,String> tree;

    @BeforeEach
    void treeInit() {
        tree = new HashMap<>();

        tree.put(11,"Яблуко");
        tree.put(19,"Апельсин");
        tree.put(15,"Вишня");
        tree.put(25,"Персик");
        tree.put(12,"Черешня");
        tree.put(13,"Манго");
        tree.put(16,"Мандарин");
        tree.put(7,"Полуниця");
        tree.put(24,"Лимон");
        tree.put(20,"Груша");
        tree.put(10,"Малина");
        tree.put(21,"Грейпфрут");
        tree.put(8,"Ківі");
        tree.put(17,"Диня");
        tree.put(18,"Гранат");
        tree.put(9,"Хурма");
        tree.put(26,"Помела");
        tree.put(23,"Банан");
        tree.put(14,"Кокос");
        tree.put(22,"Авокадо");
    }

    private BSTNode mapTransferBstnode() {
        BSTNode node = new BSTNode();

        for (Map.Entry<Integer,String> item: tree.entrySet()) {
            node.put(item.getKey(), item.getValue());
        }
        return node;
    }

    @Test
    void Test1() {
        BSTNode node = mapTransferBstnode();

        Assertions.assertEquals(20,tree.size());
    }

    @Test
    void Test2() {
        BSTNode node = mapTransferBstnode();

        node.depthOrderTraversal();
        System.out.println();
        Assertions.assertEquals(20,tree.size());
    }

    @Test
    void Test3() {
        BSTNode node = mapTransferBstnode();

        Assertions.assertEquals("Грейпфрут",node.searchValue(21));
        Assertions.assertNull(node.searchValue(90));
        Assertions.assertEquals("Апельсин",node.searchValue(19));
        Assertions.assertNull(node.searchValue(45));
    }

    @Test
    void Test4() {
        BSTNode node = new BSTNode();

        for (Map.Entry<Integer,String> item: tree.entrySet()) {
            if(item.getKey()!=20) {
                node.put(item.getKey(), item.getValue());
            }
        }


        node.put(20,"Груша");

        System.out.println(node.searchValue(20));
        Assertions.assertEquals("Груша",node.searchValue(20));
        node.put(20,"Лохина");

        node.depthOrderTraversal();
        System.out.println();
        Assertions.assertEquals(20,node.size());

        System.out.println(node.searchValue(20));
        Assertions.assertEquals("Лохина",node.searchValue(20));
    }
    @Test
    void Test5() {
        BSTNode node = mapTransferBstnode();

        node.delete(14);

        node.depthOrderTraversal();
        System.out.println();
        Assertions.assertEquals(19,node.size());
        Assertions.assertNull(node.searchValue(14));
    }
}
