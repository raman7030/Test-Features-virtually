.class public final Ll/۫ᩴᩳ;
.super Ljava/lang/Object;
.source "L6RY"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:[B

.field public ᩹:Ll/ۚ۬ᩳ;


# direct methods
.method public constructor <init>([BLl/ۚ۬ᩳ;)V
    .locals 0

    .line 293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ᩴᩳ;->᩸:[B

    iput-object p2, p0, Ll/۫ᩴᩳ;->᩹:Ll/ۚ۬ᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    const/4 v0, 0x0

    .line 303
    iput-object v0, p0, Ll/۫ᩴᩳ;->᩸:[B

    .line 304
    iget-object v1, p0, Ll/۫ᩴᩳ;->᩹:Ll/ۚ۬ᩳ;

    iput-object v0, p0, Ll/۫ᩴᩳ;->᩹:Ll/ۚ۬ᩳ;

    if-eqz v1, :cond_0

    .line 305
    invoke-virtual {v1}, Ll/ۚ۬ᩳ;->close()V

    :cond_0
    return-void
.end method

.method public final ֫()[B
    .locals 2

    .line 295
    iget-object v0, p0, Ll/۫ᩴᩳ;->᩸:[B

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment record is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(J)Ll/ۚ۬ᩳ;
    .locals 1

    .line 299
    invoke-virtual {p0}, Ll/۫ᩴᩳ;->֫()[B

    .line 300
    iget-object v0, p0, Ll/۫ᩴᩳ;->᩹:Ll/ۚ۬ᩳ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ۚ۬ᩳ;->ۧ(J)Ll/ۚ۬ᩳ;

    move-result-object p1

    return-object p1
.end method
