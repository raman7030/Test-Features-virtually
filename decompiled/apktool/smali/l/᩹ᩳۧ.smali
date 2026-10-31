.class public final synthetic Ll/᩹ᩳۧ;
.super Ljava/lang/Object;
.source "18UV"

# interfaces
.implements Ll/ܽܿۧ;


# instance fields
.field public final synthetic ֫:Ll/ۜܿۧ;

.field public final synthetic ۧ:Ll/᩺ᩳۧ;

.field public final synthetic ܽ:Z

.field public final synthetic ᩳ:[I


# direct methods
.method public synthetic constructor <init>(Ll/ۜܿۧ;Ll/᩺ᩳۧ;Z[I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ᩳۧ;->֫:Ll/ۜܿۧ;

    iput-object p2, p0, Ll/᩹ᩳۧ;->ۧ:Ll/᩺ᩳۧ;

    iput-boolean p3, p0, Ll/᩹ᩳۧ;->ܽ:Z

    iput-object p4, p0, Ll/᩹ᩳۧ;->ᩳ:[I

    return-void
.end method


# virtual methods
.method public final ֫(ILl/۬᩵֫;[I)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p0

    .line 2859
    new-instance v10, Ll/۬ᩳۧ;

    iget-object v1, v0, Ll/᩹ᩳۧ;->֫:Ll/ۜܿۧ;

    iget-object v11, v0, Ll/᩹ᩳۧ;->ۧ:Ll/᩺ᩳۧ;

    invoke-direct {v10, v1, v11}, Ll/۬ᩳۧ;-><init>(Ll/ۜܿۧ;Ll/᩺ᩳۧ;)V

    iget-object v1, v0, Ll/᩹ᩳۧ;->ᩳ:[I

    aget v12, v1, p1

    .line 3837
    sget v1, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v13, Ll/֫۬ܺ;

    invoke-direct {v13}, Ll/֫۬ܺ;-><init>()V

    const/4 v1, 0x0

    move-object/from16 v15, p2

    const/4 v14, 0x0

    .line 3838
    :goto_0
    iget v1, v15, Ll/۬᩵֫;->ᩳ:I

    if-ge v14, v1, :cond_0

    .line 3839
    new-instance v9, Ll/۫ᩳۧ;

    aget v6, p3, v14

    iget-boolean v7, v0, Ll/᩹ᩳۧ;->ܽ:Z

    move-object v1, v9

    move/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v14

    move-object v5, v11

    move-object v8, v10

    move-object v0, v9

    move v9, v12

    invoke-direct/range {v1 .. v9}, Ll/۫ᩳۧ;-><init>(ILl/۬᩵֫;ILl/᩺ᩳۧ;IZLl/۬ᩳۧ;I)V

    invoke-virtual {v13, v0}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    goto :goto_0

    .line 3850
    :cond_0
    invoke-virtual {v13}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method
