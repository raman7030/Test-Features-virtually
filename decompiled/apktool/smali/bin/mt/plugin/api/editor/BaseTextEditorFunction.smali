.class public abstract Lbin/mt/plugin/api/editor/BaseTextEditorFunction;
.super Ljava/lang/Object;
.source "BaseTextEditorFunction.java"

# interfaces
.implements Lbin/mt/plugin/api/editor/TextEditorFunction;


# instance fields
.field public context:Lbin/mt/plugin/api/PluginContext;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public buildOptionsView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/json/JSONObject;)Lbin/mt/plugin/api/ui/PluginView;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getContext()Lbin/mt/plugin/api/PluginContext;
    .locals 1

    .line 106
    iget-object v0, p0, Lbin/mt/plugin/api/editor/BaseTextEditorFunction;->context:Lbin/mt/plugin/api/PluginContext;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/PluginContext;

    return-object v0
.end method

.method public getOptionsData(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginView;)Lbin/mt/json/JSONObject;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public init()V
    .locals 0

    return-void
.end method

.method public final init(Lbin/mt/plugin/api/PluginContext;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lbin/mt/plugin/api/editor/BaseTextEditorFunction;->context:Lbin/mt/plugin/api/PluginContext;

    .line 78
    invoke-virtual {p0}, Lbin/mt/plugin/api/editor/BaseTextEditorFunction;->init()V

    return-void
.end method

.method public isEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
