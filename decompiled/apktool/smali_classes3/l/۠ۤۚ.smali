.class public final synthetic Ll/۠ۤۚ;
.super Ljava/lang/Object;
.source "K3OA"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/۠ۤۚ;->᩸:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    const-string v0, "delete cell("

    const-string v1, ")"

    .line 0
    iget v2, p0, Ll/۠ۤۚ;->᩸:I

    invoke-static {v2, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
