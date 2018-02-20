package alt;

import java.util.ArrayList;
import java.util.List;

interface IDirectory {
    List<IDirectory> getAll();
}

class Directory implements IDirectory {

    @Override
    public ArrayList<IDirectory> getAll() {
        ArrayList<IDirectory> dirs = new ArrayList<>();
        dirs.add(this);
        return dirs;
    }
}

class ParentDirectory implements IDirectory {
    private ArrayList<IDirectory> directories = new ArrayList<>();

    public void add(IDirectory directory) {
        directories.add(directory);
    }

    public void remove(IDirectory directory) {
        directories.remove(directory);
    }

    @Override
    public List<IDirectory> getAll() {
        List<IDirectory> dirs = new ArrayList<>();
        for (IDirectory dir : directories) {
            dirs.addAll(dir.getAll());
        }
        return dirs;
    }
}

