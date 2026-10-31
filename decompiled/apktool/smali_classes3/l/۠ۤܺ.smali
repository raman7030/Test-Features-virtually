.class public final Ll/۠ۤܺ;
.super Ljava/lang/Object;
.source "Y2OD"

# interfaces
.implements Ll/ۛܶܺ;
.implements Ljava/io/Serializable;


# instance fields
.field public final ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "expectedValuesPerKey"

    const/4 v1, 0x2

    .line 186
    invoke-static {v1, v0}, Ll/᩹ۙܺ;->֫(ILjava/lang/String;)V

    iput v1, p0, Ll/۠ۤܺ;->᩸:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 191
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Ll/۠ۤܺ;->᩸:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method
