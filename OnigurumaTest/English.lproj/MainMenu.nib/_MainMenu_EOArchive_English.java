// _MainMenu_EOArchive_English.java
// Generated by EnterpriseObjects palette at 2004\u5e745\u670820\u65e5\u6728\u66dc\u65e5 15\u664217\u520652\u79d2Asia/Tokyo

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class _MainMenu_EOArchive_English extends com.webobjects.eoapplication.EOArchive {
    OnigurumaTest _onigurumaTest0;
    com.webobjects.eointerface.swing.EOFrame _eoFrame0;
    com.webobjects.eointerface.swing.EOTextArea _nsTextView0;
    com.webobjects.eointerface.swing.EOTextField _nsTextField0, _nsTextField1, _nsTextField2, _nsTextField3;
    javax.swing.JButton _nsButton0;
    javax.swing.JPanel _nsView0;

    public _MainMenu_EOArchive_English(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();

        _nsTextField3 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField21");
        _nsTextField2 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField2");
        _nsTextField1 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField11");
        _nsTextField0 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField");
        _nsTextView0 = (com.webobjects.eointerface.swing.EOTextArea)_registered(new com.webobjects.eointerface.swing.EOTextArea(), "NSTextView");
        _onigurumaTest0 = (OnigurumaTest)_registered(new OnigurumaTest(), "OnigurumaTest");
        _nsButton0 = (javax.swing.JButton)_registered(new javax.swing.JButton("Find"), "NSButton");
        _eoFrame0 = (com.webobjects.eointerface.swing.EOFrame)_registered(new com.webobjects.eointerface.swing.EOFrame(), "Window");
        _nsView0 = (JPanel)_eoFrame0.getContentPane();
    }

    protected void _awaken() {
        super._awaken();
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "hide", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "hideOtherApplications", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "orderFrontStandardAboutPanel", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "terminate", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "unhideAllApplications", ), ""));
    }

    protected void _init() {
        super._init();
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "showGuessPanel", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "clearRecentDocuments", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "undo", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "paste", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "performClose", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "copy", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "toggleContinuousSpellChecking", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "selectAll", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "print", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "cut", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "checkSpelling", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "delete", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "performMiniaturize", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "redo", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "showHelp", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "arrangeInFront", ), ""));
        .addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(null, "runPageLayout", ), ""));
        _setFontForComponent(_nsTextField3, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField3.setEditable(false);
        _nsTextField3.setOpaque(false);
        _nsTextField3.setText("Target String:");
        _nsTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _nsTextField3.setSelectable(false);
        _nsTextField3.setEnabled(true);
        _nsTextField3.setBorder(null);
        _setFontForComponent(_nsTextField2, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField2.setEditable(false);
        _nsTextField2.setOpaque(false);
        _nsTextField2.setText("Regex:");
        _nsTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _nsTextField2.setSelectable(false);
        _nsTextField2.setEnabled(true);
        _nsTextField2.setBorder(null);
        _connect(_onigurumaTest0, _nsTextField1, "targetField");
        _setFontForComponent(_nsTextField1, "Lucida Grande", 12, Font.PLAIN);
        _nsTextField1.setEditable(true);
        _nsTextField1.setOpaque(true);
        _nsTextField1.setText("alphabetagammadelta");
        _nsTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField1.setSelectable(true);
        _nsTextField1.setEnabled(true);
        _connect(_nsTextField0, _nsTextField1, "nextFocusableComponent");
        _setFontForComponent(_nsTextField0, "Lucida Grande", 12, Font.PLAIN);
        _nsTextField0.setEditable(true);
        _nsTextField0.setOpaque(true);
        _nsTextField0.setText("a[^a]+a");
        _nsTextField0.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField0.setSelectable(true);
        _nsTextField0.setEnabled(true);
        _connect(_onigurumaTest0, _nsTextField0, "regexField");
        _nsTextView0.setEditable(true);
        _nsTextView0.setOpaque(true);
        _nsTextView0.setText("");
        _connect(_onigurumaTest0, _nsTextView0, "resultTextView");
        _nsButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_onigurumaTest0, "match", _nsButton0), ""));
        _setFontForComponent(_nsButton0, "Lucida Grande", 12, Font.PLAIN);
        _nsButton0.setMargin(new Insets(0, 2, 0, 2));
        if (!(_nsView0.getLayout() instanceof EOViewLayout)) { _nsView0.setLayout(new EOViewLayout()); }
        _nsButton0.setSize(85, 27);
        _nsButton0.setLocation(383, 31);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton0, EOViewLayout.MinXMargin | EOViewLayout.MaxYMargin);
        _nsView0.add(_nsButton0);
        _nsTextView0.setSize(493, 286);
        _nsTextView0.setLocation(-7, 62);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextView0, EOViewLayout.WidthSizable | EOViewLayout.HeightSizable);
        _nsView0.add(_nsTextView0);
        _nsTextField2.setSize(53, 17);
        _nsTextField2.setLocation(49, 5);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField2, EOViewLayout.MaxXMargin | EOViewLayout.MaxYMargin);
        _nsView0.add(_nsTextField2);
        _nsTextField3.setSize(91, 17);
        _nsTextField3.setLocation(11, 35);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField3, EOViewLayout.MaxXMargin | EOViewLayout.MaxYMargin);
        _nsView0.add(_nsTextField3);
        _nsTextField0.setSize(271, 21);
        _nsTextField0.setLocation(107, 4);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField0, EOViewLayout.WidthSizable | EOViewLayout.MaxYMargin);
        _nsView0.add(_nsTextField0);
        _nsTextField1.setSize(271, 21);
        _nsTextField1.setLocation(107, 33);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField1, EOViewLayout.WidthSizable | EOViewLayout.MaxYMargin);
        _nsView0.add(_nsTextField1);
        _nsView0.setSize(479, 362);
        _eoFrame0.setTitle("Window");
        _eoFrame0.setLocation(266, 304);
        _eoFrame0.setSize(479, 362);
    }
}
