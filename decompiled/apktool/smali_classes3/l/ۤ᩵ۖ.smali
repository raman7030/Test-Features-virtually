.class public final Ll/ۤ᩵ۖ;
.super Ljava/lang/Object;
.source "89PP"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ᩸:Ljava/util/Iterator;

.field public final ᩹:Ll/ܰ᩵ۖ;


# direct methods
.method public constructor <init>(Ll/ܰ᩵ۖ;Ljava/util/Iterator;)V
    .locals 0

    .line 554
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 555
    iput-object p1, p0, Ll/ۤ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    .line 556
    iput-object p2, p0, Ll/ۤ᩵ۖ;->᩸:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 577
    iget-object v0, p0, Ll/ۤ᩵ۖ;->᩸:Ljava/util/Iterator;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hasNext()Z
    .locals 1

    .line 561
    iget-object v0, p0, Ll/ۤ᩵ۖ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 582
    iget-object v0, p0, Ll/ۤ᩵ۖ;->᩸:Ljava/util/Iterator;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 566
    iget-object v0, p0, Ll/ۤ᩵ۖ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 571
    iget-object v0, p0, Ll/ۤ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->ܿ()V

    .line 572
    iget-object v0, p0, Ll/ۤ᩵ۖ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 587
    iget-object v0, p0, Ll/ۤ᩵ۖ;->᩸:Ljava/util/Iterator;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
