.class public final synthetic Ll/᩷ۙۜ;
.super Ljava/lang/Object;
.source "M74S"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ᩴۙۜ;

.field public final synthetic ᩹:Ll/᩻ۙۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴۙۜ;Ll/᩻ۙۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۙۜ;->᩸:Ll/ᩴۙۜ;

    iput-object p2, p0, Ll/᩷ۙۜ;->᩹:Ll/᩻ۙۜ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 104
    iget-object v0, p0, Ll/᩷ۙۜ;->᩸:Ll/ᩴۙۜ;

    invoke-virtual {v0}, Ll/ᩴۙۜ;->֫()V

    .line 105
    iget-object v0, p0, Ll/᩷ۙۜ;->᩹:Ll/᩻ۙۜ;

    invoke-virtual {v0}, Ll/᩻ۙۜ;->run()V

    return-void
.end method
