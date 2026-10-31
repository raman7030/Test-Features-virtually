.class public final Ll/᩺ᩴᩳ;
.super Ljava/lang/Object;
.source "A6S3"

# interfaces
.implements Ll/᩷۬ᩳ;


# instance fields
.field public final synthetic ᩸:Ll/ܿۖ᩷;

.field public final synthetic ᩹:Ll/᩷۬ᩳ;


# direct methods
.method public constructor <init>(Ll/᩷۬ᩳ;Ll/ܿۖ᩷;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ᩴᩳ;->᩹:Ll/᩷۬ᩳ;

    iput-object p2, p0, Ll/᩺ᩴᩳ;->᩸:Ll/ܿۖ᩷;

    return-void
.end method


# virtual methods
.method public final identity()Ll/ۜ۬ᩳ;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/᩺ᩴᩳ;->᩹:Ll/᩷۬ᩳ;

    invoke-interface {v0}, Ll/᩷۬ᩳ;->identity()Ll/ۜ۬ᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/io/InputStream;
    .locals 3

    .line 70
    iget-object v0, p0, Ll/᩺ᩴᩳ;->᩹:Ll/᩷۬ᩳ;

    check-cast v0, Ll/ۙᩴᩳ;

    invoke-virtual {v0}, Ll/ۙᩴᩳ;->֫()Ljava/io/InputStream;

    move-result-object v0

    .line 55
    iget-object v1, p0, Ll/᩺ᩴᩳ;->᩸:Ll/ܿۖ᩷;

    instance-of v2, v1, Ll/֫᩵ᩳ;

    if-nez v2, :cond_0

    return-object v0

    .line 56
    :cond_0
    invoke-static {v0, v1}, Ll/֫᩵ᩳ;->֫(Ljava/io/Closeable;Ll/ܿۖ᩷;)Ljava/io/Closeable;

    move-result-object v1

    .line 57
    new-instance v2, Ll/ۨᩴᩳ;

    invoke-direct {v2, v0, v1}, Ll/ۨᩴᩳ;-><init>(Ljava/io/InputStream;Ljava/io/Closeable;)V

    return-object v2
.end method
