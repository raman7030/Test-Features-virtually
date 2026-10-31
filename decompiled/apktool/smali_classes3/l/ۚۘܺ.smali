.class public final enum Ll/ۚۘܺ;
.super Ll/֨ۘܺ;
.source "9BH0"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "UNSPECIFIED"

    const/4 v1, 0x2

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۚۘܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 74
    invoke-direct {p0, p1, p2, v0}, Ll/֨ۘܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ljava/util/BitSet;I)I
    .locals 0

    .line 77
    invoke-virtual {p1, p2}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result p1

    return p1
.end method
