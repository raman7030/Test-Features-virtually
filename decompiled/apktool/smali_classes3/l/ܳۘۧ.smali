.class public final Ll/ܳۘۧ;
.super Ljava/lang/Object;
.source "H8H9"


# instance fields
.field public final ֫:J

.field public final ۖ:I

.field public final ۜ:J

.field public final ۡ:I

.field public final ۢ:[Ll/᩻ۘۧ;

.field public final ۧ:[J

.field public final ܳ:I

.field public final ܺ:J

.field public final ܽ:[J

.field public final ܿ:Z

.field public final ᩳ:Ll/۠ᩴ֫;

.field public final ᩷:I

.field public final ᩻:J


# direct methods
.method public constructor <init>(IIJJJJLl/۠ᩴ֫;I[Ll/᩻ۘۧ;I[J[JZ)V
    .locals 3

    move-object v0, p0

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    .line 138
    iput v1, v0, Ll/ܳۘۧ;->ܳ:I

    move v1, p2

    .line 139
    iput v1, v0, Ll/ܳۘۧ;->ۖ:I

    move-wide v1, p3

    .line 140
    iput-wide v1, v0, Ll/ܳۘۧ;->ܺ:J

    move-wide v1, p5

    .line 141
    iput-wide v1, v0, Ll/ܳۘۧ;->ۜ:J

    move-wide v1, p7

    .line 142
    iput-wide v1, v0, Ll/ܳۘۧ;->֫:J

    move-wide v1, p9

    .line 143
    iput-wide v1, v0, Ll/ܳۘۧ;->᩻:J

    move-object v1, p11

    .line 144
    iput-object v1, v0, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    move v1, p12

    .line 145
    iput v1, v0, Ll/ܳۘۧ;->ۡ:I

    move-object/from16 v1, p13

    .line 146
    iput-object v1, v0, Ll/ܳۘۧ;->ۢ:[Ll/᩻ۘۧ;

    move/from16 v1, p14

    .line 147
    iput v1, v0, Ll/ܳۘۧ;->᩷:I

    move-object/from16 v1, p15

    .line 148
    iput-object v1, v0, Ll/ܳۘۧ;->ۧ:[J

    move-object/from16 v1, p16

    .line 149
    iput-object v1, v0, Ll/ܳۘۧ;->ܽ:[J

    move/from16 v1, p17

    .line 150
    iput-boolean v1, v0, Ll/ܳۘۧ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠ᩴ֫;)Ll/ܳۘۧ;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    .line 168
    new-instance v19, Ll/ܳۘۧ;

    move-object/from16 v1, v19

    iget-object v2, v0, Ll/ܳۘۧ;->ܽ:[J

    move-object/from16 v17, v2

    iget-boolean v2, v0, Ll/ܳۘۧ;->ܿ:Z

    move/from16 v18, v2

    iget v2, v0, Ll/ܳۘۧ;->ܳ:I

    iget v3, v0, Ll/ܳۘۧ;->ۖ:I

    iget-wide v4, v0, Ll/ܳۘۧ;->ܺ:J

    iget-wide v6, v0, Ll/ܳۘۧ;->ۜ:J

    iget-wide v8, v0, Ll/ܳۘۧ;->֫:J

    iget-wide v10, v0, Ll/ܳۘۧ;->᩻:J

    iget v13, v0, Ll/ܳۘۧ;->ۡ:I

    iget-object v14, v0, Ll/ܳۘۧ;->ۢ:[Ll/᩻ۘۧ;

    iget v15, v0, Ll/ܳۘۧ;->᩷:I

    move-object/from16 p1, v1

    iget-object v1, v0, Ll/ܳۘۧ;->ۧ:[J

    move-object/from16 v16, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v18}, Ll/ܳۘۧ;-><init>(IIJJJJLl/۠ᩴ֫;I[Ll/᩻ۘۧ;I[J[JZ)V

    return-object v19
.end method

.method public final ֫(I)Ll/᩻ۘۧ;
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ܳۘۧ;->ۢ:[Ll/᩻ۘۧ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 164
    :cond_0
    aget-object p1, v0, p1

    return-object p1
.end method
