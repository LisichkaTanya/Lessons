package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainCollection {
    private static final String UUID_1 = "uuid1";
    private static final String UUID_2 = "uuid2";
    private static final String UUID_3 = "uuid3";
    private static final Resume RESUME_1 = new Resume(UUID_1);
    private static final Resume RESUME_2 = new Resume(UUID_2);
    private static final Resume RESUME_3 = new Resume(UUID_3);

    public static void main(String[] args) {
        Collection<Resume> collection = new ArrayList<>();
        collection.add(RESUME_1);
        collection.add(RESUME_2);
        collection.add(RESUME_3);

        Iterator<Resume> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Resume resume = iterator.next();
            System.out.println(resume);
            if (resume.getUuid().equals(UUID_1)) {
                iterator.remove();
            }
        }

//        collection.removeIf(resume -> resume.getUuid().equals(UUID_1));

        System.out.println(collection.toString());
    }
}
