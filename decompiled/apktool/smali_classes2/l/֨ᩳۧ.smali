.class public final synthetic Ll/֨ᩳۧ;
.super Ljava/lang/Object;
.source "18UV"

# interfaces
.implements Ll/ܽܿۧ;


# instance fields
.field public final synthetic ֫:Ll/᩺ᩳۧ;


# direct methods
.method public synthetic constructor <init>(Ll/᩺ᩳۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ᩳۧ;->֫:Ll/᩺ᩳۧ;

    return-void
.end method


# virtual methods
.method public final ֫(ILl/۬᩵֫;[I)Ljava/util/List;
    .locals 9

    .line 4213
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    const/4 v1, 0x0

    .line 4214
    :goto_0
    iget v2, p2, Ll/۬᩵֫;->ᩳ:I

    if-ge v1, v2, :cond_0

    .line 4215
    new-instance v8, Ll/ۤᩳۧ;

    aget v7, p3, v1

    iget-object v6, p0, Ll/֨ᩳۧ;->֫:Ll/᩺ᩳۧ;

    move-object v2, v8

    move v3, p1

    move-object v4, p2

    move v5, v1

    invoke-direct/range {v2 .. v7}, Ll/ۤᩳۧ;-><init>(ILl/۬᩵֫;ILl/᩺ᩳۧ;I)V

    invoke-virtual {v0, v8}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4219
    :cond_0
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1
.end method
