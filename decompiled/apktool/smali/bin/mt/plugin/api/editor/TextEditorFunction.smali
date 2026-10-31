.class public interface abstract Lbin/mt/plugin/api/editor/TextEditorFunction;
.super Ljava/lang/Object;
.source "TextEditorFunction.java"


# static fields
.field public static final VALIDATION_FAILED:Lbin/mt/json/JSONObject;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    invoke-static {v0}, Lbin/mt/json/JSONObject;->unmodifiableObject(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    sput-object v0, Lbin/mt/plugin/api/editor/TextEditorFunction;->VALIDATION_FAILED:Lbin/mt/json/JSONObject;

    return-void
.end method


# virtual methods
.method public abstract buildOptionsView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/json/JSONObject;)Lbin/mt/plugin/api/ui/PluginView;
.end method

.method public abstract doFunction(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/editor/TextEditor;Lbin/mt/json/JSONObject;)V
.end method

.method public abstract getContext()Lbin/mt/plugin/api/PluginContext;
.end method

.method public abstract getOptionsData(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginView;)Lbin/mt/json/JSONObject;
.end method

.method public abstract init(Lbin/mt/plugin/api/PluginContext;)V
.end method

.method public abstract isEnabled()Z
.end method

.method public abstract name()Ljava/lang/String;
.end method

.method public abstract supportEditTextView()Z
.end method

.method public abstract supportRepeat()Z
.end method
