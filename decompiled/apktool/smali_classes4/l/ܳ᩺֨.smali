.class public final Ll/ܳ᩺֨;
.super Ljava/lang/Object;
.source "Y7SB"


# instance fields
.field public ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1242
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1243
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܳ᩺֨;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/StringBuilder;)I
    .locals 3

    .line 1245
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1246
    iget-object v0, p0, Ll/ܳ᩺֨;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 1248
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 1250
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 1251
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1
.end method
