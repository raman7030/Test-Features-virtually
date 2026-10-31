.class public final synthetic Ll/ۘ۫᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/ܿۛ᩷;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/ܿۛ᩷;ZZ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ۫᩷;->᩸:Ll/ܿۛ᩷;

    iput-boolean p2, p0, Ll/ۘ۫᩷;->᩹:Z

    iput-boolean p3, p0, Ll/ۘ۫᩷;->᩶:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    sget v0, Ll/ܿۛ᩷;->ۛۧ:I

    .line 2222
    new-instance v0, Ll/ۖۤ᩷;

    iget-object v1, p0, Ll/ۘ۫᩷;->᩸:Ll/ܿۛ᩷;

    iget-boolean v2, p0, Ll/ۘ۫᩷;->᩹:Z

    iget-boolean v3, p0, Ll/ۘ۫᩷;->᩶:Z

    invoke-direct {v0, v1, v2, v3}, Ll/ۖۤ᩷;-><init>(Ll/ܿۛ᩷;ZZ)V

    .line 2385
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
