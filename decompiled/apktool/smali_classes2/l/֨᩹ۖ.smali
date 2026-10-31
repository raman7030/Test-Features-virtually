.class public Ll/֨᩹ۖ;
.super Ljava/lang/Object;
.source "64HS"


# instance fields
.field public ֫:Ljava/util/HashMap;

.field public ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֨᩹ۖ;->֫:Ljava/util/HashMap;

    .line 12
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֨᩹ۖ;->ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public ֫(Ll/۬᩶ۖ;)Ll/۬᩶ۖ;
    .locals 2

    .line 15
    iget-object v0, p0, Ll/֨᩹ۖ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩶ۖ;

    if-nez v1, :cond_0

    .line 44
    new-instance v1, Ll/۬᩶ۖ;

    invoke-direct {v1}, Ll/۬᩶ۖ;-><init>()V

    .line 18
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public final ֫(Ll/ᩳ᩶ۖ;)Ll/ᩳ᩶ۖ;
    .locals 2

    .line 24
    iget-object v0, p0, Ll/֨᩹ۖ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳ᩶ۖ;

    if-nez v1, :cond_0

    .line 26
    invoke-virtual {p1}, Ll/ᩳ᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v1

    check-cast v1, Ll/ᩳ᩶ۖ;

    .line 27
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method
