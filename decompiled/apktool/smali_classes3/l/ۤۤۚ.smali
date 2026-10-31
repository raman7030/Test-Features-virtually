.class public final synthetic Ll/ۤۤۚ;
.super Ljava/lang/Object;
.source "K3OA"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۤۤۚ;->᩸:I

    iput p2, p0, Ll/ۤۤۚ;->᩹:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 267
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "calling ensureCapacity( "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۤۤۚ;->᩸:I

    iget v2, p0, Ll/ۤۤۚ;->᩹:I

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " )"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
