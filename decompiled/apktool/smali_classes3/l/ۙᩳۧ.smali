.class public final synthetic Ll/ۙᩳۧ;
.super Ljava/lang/Object;
.source "18UV"

# interfaces
.implements Ll/ܽܿۧ;


# instance fields
.field public final synthetic ֫:Ll/᩺ᩳۧ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/᩺ᩳۧ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙᩳۧ;->֫:Ll/᩺ᩳۧ;

    iput-object p2, p0, Ll/ۙᩳۧ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۙᩳۧ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(ILl/۬᩵֫;[I)Ljava/util/List;
    .locals 11

    .line 4077
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    const/4 v1, 0x0

    .line 4078
    :goto_0
    iget v2, p2, Ll/۬᩵֫;->ᩳ:I

    if-ge v1, v2, :cond_0

    .line 4079
    new-instance v10, Ll/ۧܿۧ;

    aget v7, p3, v1

    iget-object v6, p0, Ll/ۙᩳۧ;->֫:Ll/᩺ᩳۧ;

    iget-object v8, p0, Ll/ۙᩳۧ;->ۧ:Ljava/lang/String;

    iget-object v9, p0, Ll/ۙᩳۧ;->ܽ:Ljava/lang/String;

    move-object v2, v10

    move v3, p1

    move-object v4, p2

    move v5, v1

    invoke-direct/range {v2 .. v9}, Ll/ۧܿۧ;-><init>(ILl/۬᩵֫;ILl/᩺ᩳۧ;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4089
    :cond_0
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1
.end method
