.class public final synthetic Ll/۬֫֨;
.super Ljava/lang/Object;
.source "T7EH"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/ۨ֫֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ֫֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬֫֨;->᩸:Ll/ۨ֫֨;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 84
    iget-object v0, p0, Ll/۬֫֨;->᩸:Ll/ۨ֫֨;

    iget v1, v0, Ll/ۨ֫֨;->ۗ֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v0, v0, Ll/ۨ֫֨;->ۨ֫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "#%d:#%d;"

    .line 19
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
