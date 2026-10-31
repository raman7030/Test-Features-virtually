.class public abstract Ll/ۛۙ;
.super Landroid/app/Service;
.source "MB1I"


# instance fields
.field public ᩸:Ll/ܺۙ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 50
    new-instance v0, Ll/ۤۙ;

    invoke-direct {v0, p0}, Ll/ۤۙ;-><init>(Ll/ۛۙ;)V

    iput-object v0, p0, Ll/ۛۙ;->᩸:Ll/ܺۙ;

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 70
    iget-object p1, p0, Ll/ۛۙ;->᩸:Ll/ܺۙ;

    return-object p1
.end method

.method public abstract ֫()V
.end method
