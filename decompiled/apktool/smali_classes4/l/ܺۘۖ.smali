.class public final Ll/ܺۘۖ;
.super Ljava/lang/Object;
.source "HAVQ"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ۗ:I

.field public final ۙ:Ljava/lang/reflect/Field;

.field public final ۛ:Ljava/lang/Class;

.field public final ۟:Ll/֨ۘۖ;

.field public final ۤ:Ll/۬֡ۖ;

.field public final ۨ:Ljava/lang/reflect/Field;

.field public final ۫:Ljava/lang/Class;

.field public final ۬:Ljava/lang/Object;

.field public final ܰ:Z

.field public final ᩶:Ll/۫ᩴۖ;

.field public final ᩸:Ljava/lang/reflect/Field;

.field public final ᩹:Z

.field public final ᩺:I


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;Ljava/lang/reflect/Field;IZZLl/۬֡ۖ;Ljava/lang/Class;Ljava/lang/Object;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)V
    .locals 0

    .line 310
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 311
    iput-object p1, p0, Ll/ܺۘۖ;->ۙ:Ljava/lang/reflect/Field;

    .line 312
    iput-object p3, p0, Ll/ܺۘۖ;->۟:Ll/֨ۘۖ;

    .line 313
    iput-object p4, p0, Ll/ܺۘۖ;->۫:Ljava/lang/Class;

    .line 314
    iput p2, p0, Ll/ܺۘۖ;->ۗ:I

    .line 315
    iput-object p5, p0, Ll/ܺۘۖ;->ۨ:Ljava/lang/reflect/Field;

    .line 316
    iput p6, p0, Ll/ܺۘۖ;->᩺:I

    .line 317
    iput-boolean p7, p0, Ll/ܺۘۖ;->ܰ:Z

    .line 318
    iput-boolean p8, p0, Ll/ܺۘۖ;->᩹:Z

    .line 319
    iput-object p9, p0, Ll/ܺۘۖ;->ۤ:Ll/۬֡ۖ;

    .line 320
    iput-object p10, p0, Ll/ܺۘۖ;->ۛ:Ljava/lang/Class;

    .line 321
    iput-object p11, p0, Ll/ܺۘۖ;->۬:Ljava/lang/Object;

    .line 322
    iput-object p12, p0, Ll/ܺۘۖ;->᩶:Ll/۫ᩴۖ;

    .line 323
    iput-object p13, p0, Ll/ܺۘۖ;->᩸:Ljava/lang/reflect/Field;

    return-void
.end method

.method public static ֫(ILl/֨ۘۖ;Ll/۬֡ۖ;Ljava/lang/Class;ZLl/۫ᩴۖ;)Ll/ܺۘۖ;
    .locals 15

    .line 210
    invoke-static {p0}, Ll/ܺۘۖ;->֫(I)V

    const-string v0, "oneofStoredType"

    move-object/from16 v11, p3

    .line 213
    invoke-static {v11, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    invoke-virtual/range {p1 .. p1}, Ll/֨ۘۖ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    new-instance v0, Ll/ܺۘۖ;

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, v0

    move v3, p0

    move-object/from16 v4, p1

    move/from16 v9, p4

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v13, p5

    invoke-direct/range {v1 .. v14}, Ll/ܺۘۖ;-><init>(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;Ljava/lang/reflect/Field;IZZLl/۬֡ۖ;Ljava/lang/Class;Ljava/lang/Object;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 215
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Oneof is only supported for scalar fields. Field "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move v2, p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/reflect/Field;ILjava/lang/Object;Ll/۫ᩴۖ;)Ll/ܺۘۖ;
    .locals 15

    const-string v0, "mapDefaultEntry"

    move-object/from16 v12, p2

    .line 278
    invoke-static {v12, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    invoke-static/range {p1 .. p1}, Ll/ܺۘۖ;->֫(I)V

    const-string v0, "field"

    move-object v2, p0

    .line 280
    invoke-static {p0, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    new-instance v0, Ll/ܺۘۖ;

    sget-object v4, Ll/֨ۘۖ;->᩹֫:Ll/֨ۘۖ;

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v1, v0

    move/from16 v3, p1

    move-object/from16 v13, p3

    invoke-direct/range {v1 .. v14}, Ll/ܺۘۖ;-><init>(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;Ljava/lang/reflect/Field;IZZLl/۬֡ۖ;Ljava/lang/Class;Ljava/lang/Object;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;)Ll/ܺۘۖ;
    .locals 15

    .line 94
    invoke-static/range {p1 .. p1}, Ll/ܺۘۖ;->֫(I)V

    const-string v0, "field"

    move-object v2, p0

    .line 95
    invoke-static {p0, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldType"

    move-object/from16 v4, p2

    .line 96
    invoke-static {v4, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageClass"

    move-object/from16 v5, p3

    .line 97
    invoke-static {v5, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    new-instance v0, Ll/ܺۘۖ;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v1, v0

    move/from16 v3, p1

    invoke-direct/range {v1 .. v14}, Ll/ܺۘۖ;-><init>(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;Ljava/lang/reflect/Field;IZZLl/۬֡ۖ;Ljava/lang/Class;Ljava/lang/Object;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/reflect/Field;)Ll/ܺۘۖ;
    .locals 15

    move-object/from16 v3, p2

    .line 69
    invoke-static/range {p1 .. p1}, Ll/ܺۘۖ;->֫(I)V

    const-string v0, "field"

    move-object v1, p0

    .line 70
    invoke-static {p0, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldType"

    .line 71
    invoke-static {v3, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    sget-object v0, Ll/֨ۘۖ;->ۙ֫:Ll/֨ۘۖ;

    if-eq v3, v0, :cond_0

    sget-object v0, Ll/֨ۘۖ;->᩵֫:Ll/֨ۘۖ;

    if-eq v3, v0, :cond_0

    .line 75
    new-instance v14, Ll/ܺۘۖ;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, v14

    move-object v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v13, p3

    invoke-direct/range {v0 .. v13}, Ll/ܺۘۖ;-><init>(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;Ljava/lang/reflect/Field;IZZLl/۬֡ۖ;Ljava/lang/Class;Ljava/lang/Object;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)V

    return-object v14

    .line 73
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Shouldn\'t be called for repeated message fields."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/reflect/Field;IZLl/۫ᩴۖ;)Ll/ܺۘۖ;
    .locals 15

    move/from16 v6, p4

    .line 167
    invoke-static/range {p1 .. p1}, Ll/ܺۘۖ;->֫(I)V

    const-string v0, "field"

    move-object v1, p0

    .line 168
    invoke-static {p0, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldType"

    move-object/from16 v3, p2

    .line 169
    invoke-static {v3, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presenceField"

    move-object/from16 v5, p3

    .line 170
    invoke-static {v5, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v6, :cond_0

    add-int/lit8 v0, v6, -0x1

    and-int/2addr v0, v6

    if-nez v0, :cond_0

    .line 175
    new-instance v14, Ll/ܺۘۖ;

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, v14

    move-object v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v8, p5

    move-object/from16 v12, p6

    invoke-direct/range {v0 .. v13}, Ll/ܺۘۖ;-><init>(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;Ljava/lang/reflect/Field;IZZLl/۬֡ۖ;Ljava/lang/Class;Ljava/lang/Object;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)V

    return-object v14

    .line 172
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "presenceMask must have exactly one bit set: "

    .line 0
    invoke-static {v6, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 172
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ll/۫ᩴۖ;)Ll/ܺۘۖ;
    .locals 15

    .line 116
    invoke-static/range {p1 .. p1}, Ll/ܺۘۖ;->֫(I)V

    const-string v0, "field"

    move-object v2, p0

    .line 117
    invoke-static {p0, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    new-instance v0, Ll/ܺۘۖ;

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, v0

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v13, p3

    invoke-direct/range {v1 .. v14}, Ll/ܺۘۖ;-><init>(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;Ljava/lang/reflect/Field;IZZLl/۬֡ۖ;Ljava/lang/Class;Ljava/lang/Object;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)Ll/ܺۘۖ;
    .locals 15

    .line 140
    invoke-static/range {p1 .. p1}, Ll/ܺۘۖ;->֫(I)V

    const-string v0, "field"

    move-object v2, p0

    .line 141
    invoke-static {p0, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    new-instance v0, Ll/ܺۘۖ;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v0

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    invoke-direct/range {v1 .. v14}, Ll/ܺۘۖ;-><init>(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;Ljava/lang/reflect/Field;IZZLl/۬֡ۖ;Ljava/lang/Class;Ljava/lang/Object;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Z)Ll/ܺۘۖ;
    .locals 15

    move-object/from16 v3, p2

    .line 44
    invoke-static/range {p1 .. p1}, Ll/ܺۘۖ;->֫(I)V

    const-string v0, "field"

    move-object v1, p0

    .line 45
    invoke-static {p0, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldType"

    .line 46
    invoke-static {v3, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    sget-object v0, Ll/֨ۘۖ;->ۙ֫:Ll/֨ۘۖ;

    if-eq v3, v0, :cond_0

    sget-object v0, Ll/֨ۘۖ;->᩵֫:Ll/֨ۘۖ;

    if-eq v3, v0, :cond_0

    .line 50
    new-instance v14, Ll/ܺۘۖ;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, v14

    move-object v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v8, p3

    invoke-direct/range {v0 .. v13}, Ll/ܺۘۖ;-><init>(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;Ljava/lang/reflect/Field;IZZLl/۬֡ۖ;Ljava/lang/Class;Ljava/lang/Object;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)V

    return-object v14

    .line 48
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Shouldn\'t be called for repeated message fields."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(I)V
    .locals 2

    if-lez p0, :cond_0

    return-void

    .line 239
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "fieldNumber must be positive: "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 239
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/reflect/Field;IZLl/۫ᩴۖ;)Ll/ܺۘۖ;
    .locals 15

    move/from16 v6, p4

    .line 252
    invoke-static/range {p1 .. p1}, Ll/ܺۘۖ;->֫(I)V

    const-string v0, "field"

    move-object v1, p0

    .line 253
    invoke-static {p0, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldType"

    move-object/from16 v3, p2

    .line 254
    invoke-static {v3, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presenceField"

    move-object/from16 v5, p3

    .line 255
    invoke-static {v5, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v6, :cond_0

    add-int/lit8 v0, v6, -0x1

    and-int/2addr v0, v6

    if-nez v0, :cond_0

    .line 260
    new-instance v14, Ll/ܺۘۖ;

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, v14

    move-object v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v8, p5

    move-object/from16 v12, p6

    invoke-direct/range {v0 .. v13}, Ll/ܺۘۖ;-><init>(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;Ljava/lang/reflect/Field;IZZLl/۬֡ۖ;Ljava/lang/Class;Ljava/lang/Object;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)V

    return-object v14

    .line 257
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "presenceMask must have exactly one bit set: "

    .line 0
    invoke-static {v6, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 257
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 16
    check-cast p1, Ll/ܺۘۖ;

    .line 362
    iget v0, p0, Ll/ܺۘۖ;->ۗ:I

    iget p1, p1, Ll/ܺۘۖ;->ۗ:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final getType()Ll/֨ۘۖ;
    .locals 1

    .line 338
    iget-object v0, p0, Ll/ܺۘۖ;->۟:Ll/֨ۘۖ;

    return-object v0
.end method

.method public final ֡()Z
    .locals 1

    .line 399
    iget-boolean v0, p0, Ll/ܺۘۖ;->᩹:Z

    return v0
.end method

.method public final ֫()Ljava/lang/reflect/Field;
    .locals 1

    .line 403
    iget-object v0, p0, Ll/ܺۘۖ;->᩸:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public final ۚ()Z
    .locals 1

    .line 392
    iget-boolean v0, p0, Ll/ܺۘۖ;->ܰ:Z

    return v0
.end method

.method public final ۡ()Ll/۬֡ۖ;
    .locals 1

    .line 343
    iget-object v0, p0, Ll/ܺۘۖ;->ۤ:Ll/۬֡ۖ;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/Class;
    .locals 2

    .line 411
    sget-object v0, Ll/ۡۘۖ;->֫:[I

    iget-object v1, p0, Ll/ܺۘۖ;->۟:Ll/֨ۘۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 417
    :cond_0
    iget-object v0, p0, Ll/ܺۘۖ;->۫:Ljava/lang/Class;

    return-object v0

    .line 414
    :cond_1
    iget-object v0, p0, Ll/ܺۘۖ;->ۙ:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v0, p0, Ll/ܺۘۖ;->ۛ:Ljava/lang/Class;

    return-object v0
.end method

.method public final ۧ()Ll/۫ᩴۖ;
    .locals 1

    .line 357
    iget-object v0, p0, Ll/ܺۘۖ;->᩶:Ll/۫ᩴۖ;

    return-object v0
.end method

.method public final ܺ()Ljava/lang/reflect/Field;
    .locals 1

    .line 375
    iget-object v0, p0, Ll/ܺۘۖ;->ۨ:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/reflect/Field;
    .locals 1

    .line 333
    iget-object v0, p0, Ll/ܺۘۖ;->ۙ:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 387
    iget v0, p0, Ll/ܺۘۖ;->᩺:I

    return v0
.end method

.method public final ᩷()Ljava/lang/Object;
    .locals 1

    .line 379
    iget-object v0, p0, Ll/ܺۘۖ;->۬:Ljava/lang/Object;

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 328
    iget v0, p0, Ll/ܺۘۖ;->ۗ:I

    return v0
.end method
