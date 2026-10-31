.class public final Ll/ܿ۠֫;
.super Ljava/lang/Object;
.source "E7TQ"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:Ljava/util/ArrayList;

.field public ᩹:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 201
    iput-wide v0, p0, Ll/ܿ۠֫;->᩹:J

    .line 202
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿ۠֫;->᩸:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 195
    check-cast p1, Ll/ܿ۠֫;

    .line 214
    iget-wide v0, p0, Ll/ܿ۠֫;->᩹:J

    iget-wide v2, p1, Ll/ܿ۠֫;->᩹:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1
.end method
