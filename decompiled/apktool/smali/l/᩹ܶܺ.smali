.class public final Ll/᩹ܶܺ;
.super Ljava/lang/Object;
.source "O3OZ"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ᩸:Ll/ۗܶܺ;

.field public final synthetic ᩹:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ll/ۗܶܺ;Ljava/lang/CharSequence;)V
    .locals 0

    .line 371
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩹ܶܺ;->᩹:Ljava/lang/CharSequence;

    iput-object p1, p0, Ll/᩹ܶܺ;->᩸:Ll/ۗܶܺ;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 374
    iget-object v0, p0, Ll/᩹ܶܺ;->᩸:Ll/ۗܶܺ;

    iget-object v1, p0, Ll/᩹ܶܺ;->᩹:Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Ll/ۗܶܺ;->֫(Ll/ۗܶܺ;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, ", "

    .line 379
    invoke-static {v0}, Ll/ۜܶܺ;->֫(Ljava/lang/String;)Ll/ۜܶܺ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x5b

    .line 380
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 143
    invoke-virtual {p0}, Ll/᩹ܶܺ;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll/ۜܶܺ;->֫(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V

    const/16 v0, 0x5d

    .line 381
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 382
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
