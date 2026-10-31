.class public final Ll/۬ܺ;
.super Ljava/lang/Object;
.source "J5NH"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۫ܺ;


# direct methods
.method public constructor <init>(Ll/۫ܺ;)V
    .locals 0

    .line 715
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܺ;->᩸:Ll/۫ܺ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    const/4 v0, 0x0

    .line 721
    iget-object v1, p0, Ll/۬ܺ;->᩸:Ll/۫ܺ;

    iput-object v0, v1, Ll/۫ܺ;->۠֫:Ll/۬ܺ;

    .line 722
    invoke-virtual {v1}, Ll/۫ܺ;->drawableStateChanged()V

    return-void
.end method
