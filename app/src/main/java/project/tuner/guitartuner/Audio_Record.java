package project.tuner.guitartuner;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.app.Activity;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Audio_Record extends Activity {

    //String[] freqText = {"11.025 KHz (Lowest)", "16.000 KHz", "22.050 KHz", "44.100 KHz (Highest)"};
    //Integer[] freqset = {11025, 16000, 22050, 44100};
    //private ArrayAdapter<String> adapter;



    //Spinner spFrequency;
    //  MediaRecorder recorder = new MediaRecorder();
    //  Button startRec, stopRec;
    //  Boolean recording;


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //startRec = (Button)findViewById(R.id.startrec);
        //stopRec = (Button)findViewById(R.id.stoprec);

        //startRec.setOnClickListener(startRecOnClickListener);
        //stopRec.setOnClickListener(stopRecOnClickListener);

        //spFrequency = (Spinner)findViewById(R.id.frequency);
        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, freqText);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spFrequency.setAdapter(adapter);

        //stopRec.setEnabled(false);
        // addListenerOnButton();
    }

    public void onRadioButtonClicked(View v) {
        Button E = (Button)findViewById(R.id.stringE);
        Button A = (Button)findViewById(R.id.stringA);
        Button D = (Button)findViewById(R.id.stringD);
        Button G = (Button)findViewById(R.id.stringG);
        Button B = (Button)findViewById(R.id.stringb);
        Button Es = (Button)findViewById(R.id.stringes);


        //use two labels, current frequency and target frequency, set tag on button after set text for target frequency, shoulllllldddd work????? dont forget you fucking idiot!
        switch (v.getId()) {
            case R.id.stnd:
                E.setText("E");
                A.setText("A");
                D.setText("D");
                G.setText("G");
                B.setText("B");
                Es.setText("E");

                E.setTag("82.41");
                A.setTag("110.00");
                D.setTag("146.83");
                G.setTag("196.00");
                B.setTag("246.94");
                Es.setTag("329.63");

                break;

            case R.id.dd:
                E.setText("D");
                A.setText("A");
                D.setText("D");
                G.setText("G");
                B.setText("b");
                Es.setText("e");

                E.setTag("73.42");
                A.setTag("110.00");
                D.setTag("146.83");
                G.setTag("196.00");
                B.setTag("246.94");
                Es.setTag("329.63");

                break;

            case R.id.dstnd:
                E.setText("D");
                A.setText("G");
                D.setText("C");
                G.setText("F");
                B.setText("A");
                Es.setText("D");

                E.setTag("73.42");
                A.setTag("98.00");
                D.setTag("130.81");
                G.setTag("174.61");
                B.setTag("220.00");
                Es.setTag("293.66");

                break;

            case R.id.dc:
                E.setText("C");
                A.setText("G");
                D.setText("C");
                G.setText("F");
                B.setText("A");
                Es.setText("D");

                E.setTag("65.41");
                A.setTag("98.00");
                D.setTag("130.81");
                G.setTag("174.61");
                B.setTag("220.00");
                Es.setTag("293.66");
                break;

            case R.id.cstnd:
                E.setText("C");
                A.setText("F");
                D.setText("A#");
                G.setText("D#");
                B.setText("G");
                Es.setText("C");

                E.setTag("65.41");
                A.setTag("87.31");
                D.setTag("116.54");
                G.setTag("155.56");
                B.setTag("196.00");
                Es.setTag("261.63");
                break;

            case R.id.db:
                E.setText("B");
                A.setText("F#");
                D.setText("B");
                G.setText("E");
                B.setText("G#");
                Es.setText("C#");

                E.setTag("61.74");
                A.setTag("87.31");
                D.setTag("116.54");
                G.setTag("155.56");
                B.setTag("196.00");
                Es.setTag("261.63");
                break;

            case R.id.bstnd:
                E.setText("B");
                A.setText("E");
                D.setText("A");
                G.setText("D");
                B.setText("F#");
                Es.setText("B");

                E.setTag("61.74");
                A.setTag("82.41");
                D.setTag("110.00");
                G.setTag("146.83");
                B.setTag("185.00");
                Es.setTag("246.94");
                break;

            case R.id.da:
                E.setText("A");
                A.setText("E");
                D.setText("A");
                G.setText("D");
                B.setText("F#");
                Es.setText("B");

                E.setTag("55.00");
                A.setTag("82.41");
                D.setTag("110.00");
                G.setTag("146.83");
                B.setTag("185.00");
                Es.setTag("246.94");
                break;

        }
    }

    public void onButtonClicked(View v) {
        TextView target = (TextView) findViewById(R.id.target);

        Button E = (Button)findViewById(R.id.stringE);
        Button A = (Button)findViewById(R.id.stringA);
        Button D = (Button)findViewById(R.id.stringD);
        Button G = (Button)findViewById(R.id.stringG);
        Button B = (Button)findViewById(R.id.stringb);
        Button Es = (Button)findViewById(R.id.stringes);


        switch (v.getId()) {
            case R.id.stringE:
                target.setText("Target Frequency : " + v.getTag().toString() + "Hz");
                E.set
                break;

            case R.id.stringA:
                target.setText("Target Frequency : " + v.getTag().toString() + "Hz");
                break;

            case R.id.stringD:
                target.setText("Target Frequency : " + v.getTag().toString() + "Hz");
                break;

            case R.id.stringG:
                target.setText("Target Frequency : " + v.getTag().toString() + "Hz");
                break;

            case R.id.stringb:
                target.setText("Target Frequency : " + v.getTag().toString() + "Hz");
                break;

            case R.id.stringes:
                target.setText("Target Frequency : " + v.getTag().toString() + "Hz");
                break;
        }
    }
}

   // OnClickListener startRecOnClickListener
     //       = new OnClickListener(){

       // @Override
        //public void onClick(View arg0) {

           // Thread recordThread = new Thread(new Runnable(){

            //    @Override
             //   public void run() {
              //      recording = true;
              //      startRecord();
                //}

            //});

           // recordThread.start();
            //startRec.setEnabled(false);
            //stopRec.setEnabled(true);

        //}};

    //OnClickListener stopRecOnClickListener
        //    = new OnClickListener(){

       // @Override
       // public void onClick(View arg0) {
         //   recording = false;
         //   startRec.setEnabled(true);
          //  stopRec.setEnabled(false);
     //   }};

    //OnClickListener playBackOnClickListener
    //        = new OnClickListener(){

    //    @Override
    //    public void onClick(View v) {
    //        playRecord();
    //    }

    //};

   // private void startRecord() {
     //   SaveRecording();

        //File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "test.pcm");

        //int selectedPos = spFrequency.getSelectedItemPosition();
        //int sampleFreq = freqset[selectedPos];

        //final String promptStartRecord =
        //      "startRecord()\n"
        //          + file.getAbsolutePath(); //"\n"
        //          + (String)spFrequency.getSelectedItem();

        //runOnUiThread(new Runnable(){

        //  @Override
        //public void run() {
        //  Toast.makeText(Audio_Record.this,
        //        promptStartRecord,
        //      Toast.LENGTH_LONG).show();
        //}});

        //try {
            //file.createNewFile();

            //OutputStream outputStream = new FileOutputStream(file);
            //BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            //DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);

          //  int minBufferSize = AudioRecord.getMinBufferSize(44100,
            //        AudioFormat.CHANNEL_CONFIGURATION_MONO,
             //       AudioFormat.ENCODING_PCM_16BIT);

            //short[] audioData = new short[minBufferSize];

            //AudioRecord audioRecord = new AudioRecord(MediaRecorder.AudioSource.MIC,
              //      44100,
                //    AudioFormat.CHANNEL_CONFIGURATION_MONO,
                  //  AudioFormat.ENCODING_PCM_16BIT,
                   // minBufferSize);

            //audioRecord.startRecording();

            //while(recording){
            //  int numberOfShort = audioRecord.read(audioData, 0, minBufferSize);
            //for(int i = 0; i < numberOfShort; i++){
            //  dataOutputStream.writeShort(audioData[i]);
            //}
            //}

            //audioRecord.stop();
            //dataOutputStream.close();

//        } catch (IOException e) {
            //          e.printStackTrace();
            //    }

        //}
   // }

  //  private void SaveRecording() {
      //  recorder = new MediaRecorder();
      //  recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
      //  recorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
       // recorder.setOutputFile(Environment.getExternalStorageDirectory()
      //          .getAbsolutePath() + "/SoundFile.mp3");
     //   recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
     //   try {
     //       recorder.prepare();
      //      recorder.start();
      //  }
       // catch (IOException e)
     //   {
     //       e.printStackTrace();
      //  }


   // }

    //void playRecord(){

      //  File file = new File(Environment.getExternalStorageDirectory(), "test.pcm");

       // int shortSizeInBytes = Short.SIZE/Byte.SIZE;

       // int bufferSizeInBytes = (int)(file.length()/shortSizeInBytes);
       // short[] audioData = new short[bufferSizeInBytes];

       // try {
        //    InputStream inputStream = new FileInputStream(file);
        //    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
         //   DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);

          //  int i = 0;
          //  while(dataInputStream.available() > 0){
           //     audioData[i] = dataInputStream.readShort();
           //     i++;
           // }

         //   dataInputStream.close();

            //int selectedPos = spFrequency.getSelectedItemPosition();
            //int sampleFreq = freqset[selectedPos];

            //final String promptPlayRecord =
              //      "PlayRecord()\n"
                //            + file.getAbsolutePath() + "\n"
                  //          + (String)spFrequency.getSelectedItem();

       //     Toast.makeText(Audio_Record.this,
      //              promptPlayRecord,
           //         Toast.LENGTH_LONG).show();

       //       AudioTrack audioTrack = new AudioTrack(
      //              AudioManager.STREAM_MUSIC,
       //             44100,
        //            AudioFormat.CHANNEL_CONFIGURATION_MONO,
        //            AudioFormat.ENCODING_PCM_16BIT,
         //           bufferSizeInBytes,
          //          AudioTrack.MODE_STREAM);

         //   audioTrack.play();
        //    audioTrack.write(audioData, 0, bufferSizeInBytes);


        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
       // } catch (IOException e) {
        //    e.printStackTrace();
        //}
    //}

//}