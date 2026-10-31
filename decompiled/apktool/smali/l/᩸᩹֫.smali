.class public final synthetic Ll/᩸᩹֫;
.super Ljava/lang/Object;
.source "68TO"

# interfaces
.implements Ll/ۛܶܺ;


# instance fields
.field public final synthetic ᩸:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩹֫;->᩸:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩸᩹֫;->᩸:Landroid/content/Context;

    .line 145
    invoke-static {v0}, Ll/ۖ֡֫;->֫(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object v0

    return-object v0
.end method
