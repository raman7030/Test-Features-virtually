.class public final Ll/ܶܿۜ;
.super Ljava/lang/Object;
.source "K77P"


# instance fields
.field public final ֫:[B

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>([BLjava/lang/String;)V
    .locals 2

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶܿۜ;->ۧ:Ljava/util/ArrayList;

    .line 126
    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/ܶܿۜ;->֫:[B

    .line 127
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
