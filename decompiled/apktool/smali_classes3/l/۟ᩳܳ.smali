.class public final synthetic Ll/۟ᩳܳ;
.super Ljava/lang/Object;
.source "K6ZG"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic ֫:Ll/ܳܿܳ;

.field public final synthetic ۧ:I

.field public final synthetic ܳ:Z

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:Ljava/lang/String;

.field public final synthetic ᩳ:Landroid/content/res/AssetManager;


# direct methods
.method public synthetic constructor <init>(Ll/ܳܿܳ;ILjava/lang/String;Landroid/content/res/AssetManager;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ᩳܳ;->֫:Ll/ܳܿܳ;

    iput p2, p0, Ll/۟ᩳܳ;->ۧ:I

    iput-object p3, p0, Ll/۟ᩳܳ;->ܽ:Ljava/lang/String;

    iput-object p4, p0, Ll/۟ᩳܳ;->ᩳ:Landroid/content/res/AssetManager;

    iput-object p5, p0, Ll/۟ᩳܳ;->ܿ:Ljava/lang/String;

    iput-boolean p6, p0, Ll/۟ᩳܳ;->ܳ:Z

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 7

    .line 0
    iget-boolean v6, p0, Ll/۟ᩳܳ;->ܳ:Z

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget v0, p0, Ll/۟ᩳܳ;->ۧ:I

    iget-object v1, p0, Ll/۟ᩳܳ;->ᩳ:Landroid/content/res/AssetManager;

    iget-object v2, p0, Ll/۟ᩳܳ;->֫:Ll/ܳܿܳ;

    iget-object v3, p0, Ll/۟ᩳܳ;->ܽ:Ljava/lang/String;

    iget-object v4, p0, Ll/۟ᩳܳ;->ܿ:Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Ll/ܳܿܳ;->ۧ(ILandroid/content/res/AssetManager;Ll/ܳܿܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
