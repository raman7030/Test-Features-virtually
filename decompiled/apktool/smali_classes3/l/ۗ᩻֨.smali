.class public final Ll/ۗ᩻֨;
.super Ljava/lang/Object;
.source "41SC"

# interfaces
.implements Ll/ۤ᩻֨;
.implements Ll/۫᩻֨;


# instance fields
.field public final ֫:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    array-length v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 17
    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    add-int/2addr p1, v1

    iput p1, p0, Ll/ۗ᩻֨;->֫:I

    return-void

    .line 14
    :cond_0
    new-instance p1, Ll/ۢۜ֨;

    const-string v0, "Unsupported Delta filter properties"

    .line 20
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 14
    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ֫(Ljava/io/InputStream;Ll/ۘ᩻֨;)Ljava/io/InputStream;
    .locals 1

    .line 27
    new-instance p2, Ll/۬᩻֨;

    iget v0, p0, Ll/ۗ᩻֨;->֫:I

    invoke-direct {p2, p1, v0}, Ll/۬᩻֨;-><init>(Ljava/io/InputStream;I)V

    return-object p2
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
