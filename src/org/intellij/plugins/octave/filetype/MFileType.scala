package org.intellij.plugins.octave.filetype

import com.intellij.openapi.fileTypes.FileType
import org.jetbrains.annotations._
import com.intellij.openapi.util.IconLoader
import com.intellij.openapi.vfs.{CharsetToolkit, VirtualFile}

/**
 * Octave filetype (*.m)
 */
class MFileType extends FileType {
  @NotNull override def getName = "GNU Octave file"
  @NotNull override def getDescription = "GNU Octave files"
  @NotNull override def getDefaultExtension = "m"
  override def isBinary = false
  override def isReadOnly = false

  override def getIcon = IconLoader.getIcon("/icons/octave.png")

  override def getCharset(@NotNull file: VirtualFile, bytes: Array[Byte]) = CharsetToolkit.UTF8
}

object MFileType extends MFileType
