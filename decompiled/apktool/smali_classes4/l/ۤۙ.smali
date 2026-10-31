.class public final Ll/ۤۙ;
.super Ll/ܺۙ;
.source "MB1I"


# instance fields
.field public final synthetic ܿ:Ll/ۛۙ;


# direct methods
.method public constructor <init>(Ll/ۛۙ;)V
    .locals 0

    .line 51
    iput-object p1, p0, Ll/ۤۙ;->ܿ:Ll/ۛۙ;

    .line 37
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 38
    sget-object p1, Ll/ۖۙ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۡۙ;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 62
    :cond_0
    iget-object p1, p0, Ll/ۤۙ;->ܿ:Ll/ۛۙ;

    invoke-virtual {p1}, Ll/ۛۙ;->֫()V

    return-void
.end method
