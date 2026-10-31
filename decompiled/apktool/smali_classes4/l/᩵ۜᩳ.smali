.class public final Ll/᩵ۜᩳ;
.super Ljava/lang/Object;
.source "T5WJ"


# instance fields
.field public final ֫:Ll/ۖܿܽ;

.field public ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۖܿܽ;)V
    .locals 1

    .line 246
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 243
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ۜᩳ;->ۧ:Ljava/util/ArrayList;

    .line 247
    iput-object p1, p0, Ll/᩵ۜᩳ;->֫:Ll/ۖܿܽ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩵ۜᩳ;->֫:Ll/ۖܿܽ;

    invoke-virtual {v1}, Ll/ۜᩳܽ;->ۧۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۜᩳ;->ۧ:Ljava/util/ArrayList;

    .line 254
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
