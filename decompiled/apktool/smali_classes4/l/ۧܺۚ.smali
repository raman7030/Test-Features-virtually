.class public final Ll/ۧܺۚ;
.super Ll/ۢ۬֡;
.source "Y5SH"


# instance fields
.field public ֫:I

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Ll/ۧܺۚ;

.field public ܿ:I

.field public ᩳ:Ll/ۧܺۚ;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 289
    iput-object v0, p0, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    .line 290
    iput-object v0, p0, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 295
    iput-object v0, p0, Ll/ۧܺۚ;->ۧ:Ljava/util/ArrayList;

    .line 298
    iput p1, p0, Ll/ۧܺۚ;->ܿ:I

    .line 299
    iput p2, p0, Ll/ۧܺۚ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 311
    iget v0, p0, Ll/ۧܺۚ;->ܿ:I

    return v0
.end method

.method public final ֫(I)Ll/ۧܺۚ;
    .locals 4

    .line 327
    new-instance v0, Ll/ۧܺۚ;

    iget v1, p0, Ll/ۧܺۚ;->֫:I

    iget-object v2, p0, Ll/ۧܺۚ;->ۧ:Ljava/util/ArrayList;

    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    .line 289
    iput-object v3, v0, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    .line 290
    iput-object v3, v0, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    .line 87
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 295
    iput-object v3, v0, Ll/ۧܺۚ;->ۧ:Ljava/util/ArrayList;

    .line 304
    iput p1, v0, Ll/ۧܺۚ;->ܿ:I

    .line 305
    iput v1, v0, Ll/ۧܺۚ;->֫:I

    .line 902
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 306
    iput-object v1, v0, Ll/ۧܺۚ;->ۧ:Ljava/util/ArrayList;

    .line 328
    iput p1, p0, Ll/ۧܺۚ;->֫:I

    .line 345
    iget-object p1, p0, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    iput-object v0, p1, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    .line 346
    iput-object p1, v0, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    .line 347
    iput-object p0, v0, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    .line 348
    iput-object v0, p0, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    return-object v0
.end method

.method public final ֫(Ll/ۧܺۚ;)V
    .locals 1

    .line 352
    iget-object v0, p0, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    iput-object p1, v0, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    .line 353
    iput-object v0, p1, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    .line 354
    iput-object p0, p1, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    .line 355
    iput-object p1, p0, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    return-void
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 322
    iget-object v0, p0, Ll/ۧܺۚ;->ۧ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܽ()I
    .locals 2

    .line 316
    iget v0, p0, Ll/ۧܺۚ;->֫:I

    iget v1, p0, Ll/ۧܺۚ;->ܿ:I

    sub-int/2addr v0, v1

    return v0
.end method
