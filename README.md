# pickerImage
  
  本代码是一个类似微信的图片选择器：
   
   下载后，可以添加到依赖库使用
   
    使用前需要初始化
    
    Picker.init(this);
    
    调用代码：
        Intent intent = new Intent(this, PhotoPickerActivity.class);
        intent.putExtra(PhotoPickerActivity.EXTRA_SHOW_CAMERA, true);
        intent.putExtra(PhotoPickerActivity.EXTRA_SELECT_MODE, PhotoPickerActivity.MODE_SINGLE);
        intent.putExtra(PhotoPickerActivity.EXTRA_MAX_MUN, PhotoPickerActivity.DEFAULT_NUM);
        startActivityForResult(intent, PICK_PHOTO);
       
