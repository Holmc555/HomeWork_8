    public class MyArrayList {
        private Object[] array;
        private int size;

        public MyArrayList() {
            array = new Object[10];
            size = 0;
        }

        public void add(Object value) {
            if (size == array.length) {

                Object[] newArray = new Object[array.length * 2];

                System.arraycopy(array, 0, newArray, 0, size);

                array = newArray;
            }
            array[size] = value;
            size++;
        }

        public void remove(int index) {

            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException(("Недопустимое значение!"));
            }

            Object[] newArray = new Object[size - 1];

            for (int i = 0, j = 0; i < size; i++) {
                if (i != index) {
                    newArray[j] = array[i];
                    j++;
                }
            }
            array = newArray;
            size--;
        }

        public void clear() {
            array = new Object[10];
            size = 0;
        }

        public int size() {
            return size;
        }

        public Object get(int index) {

            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Такого индекса нет!");
            }
            return array[index];

        }
    }



