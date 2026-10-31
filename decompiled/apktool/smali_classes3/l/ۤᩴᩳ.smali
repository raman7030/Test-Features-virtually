.class public final Ll/ۤᩴᩳ;
.super Ljava/lang/Object;
.source "L6RY"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:Ll/᩺ܶᩳ;

.field public final ᩹:Ll/ۛᩴᩳ;


# direct methods
.method public constructor <init>(Ll/ۛᩴᩳ;Ll/᩺ܶᩳ;)V
    .locals 0

    .line 264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iput-object p2, p0, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 265
    iput-object v0, p0, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    iget-object v0, p0, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    invoke-virtual {v0}, Ll/ۛᩴᩳ;->close()V

    return-void
.end method
