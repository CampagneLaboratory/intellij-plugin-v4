package org.antlr.intellij.plugin;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.antlr.intellij.plugin.preview.PreviewFileType;
import org.jetbrains.annotations.NotNull;

public class ANTLRv4FileTypeFactory extends FileTypeFactory{
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(ANTLRv4FileType.INSTANCE, "g4");
		fileTypeConsumer.consume(PreviewFileType.INSTANCE, "input");
    }
}
