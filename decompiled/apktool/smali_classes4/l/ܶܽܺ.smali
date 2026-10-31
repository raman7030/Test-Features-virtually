.class public final Ll/ܶܽܺ;
.super Ljava/lang/Object;
.source "1BFH"


# static fields
.field public static final ֫:[I

.field public static final ۧ:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const/16 v0, 0x100

    new-array v1, v0, [I

    .line 402
    sput-object v1, Ll/ܶܽܺ;->֫:[I

    new-array v0, v0, [Ljava/lang/String;

    .line 407
    sput-object v0, Ll/ܶܽܺ;->ۧ:[Ljava/lang/String;

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x9c2

    if-ge v0, v1, :cond_15

    const-string v1, "00 - nop;01 - aconst_null;02 - iconst_m1;03 - iconst_0;04 - iconst_1;05 - iconst_2;06 - iconst_3;07 - iconst_4;08 - iconst_5;09 - lconst_0;0a - lconst_1;0b - fconst_0;0c - fconst_1;0d - fconst_2;0e - dconst_0;0f - dconst_1;10 y bipush;11 S sipush;12 L:IFcs ldc;13 p:IFcs ldc_w;14 p:DJ ldc2_w;15 l iload;16 m lload;17 l fload;18 m dload;19 l aload;1a 0 iload_0;1b 1 iload_1;1c 2 iload_2;1d 3 iload_3;1e 1 lload_0;1f 2 lload_1;20 3 lload_2;21 4 lload_3;22 0 fload_0;23 1 fload_1;24 2 fload_2;25 3 fload_3;26 1 dload_0;27 2 dload_1;28 3 dload_2;29 4 dload_3;2a 0 aload_0;2b 1 aload_1;2c 2 aload_2;2d 3 aload_3;2e - iaload;2f - laload;30 - faload;31 - daload;32 - aaload;33 - baload;34 - caload;35 - saload;36 - istore;37 - lstore;38 - fstore;39 - dstore;3a - astore;3b 0 istore_0;3c 1 istore_1;3d 2 istore_2;3e 3 istore_3;3f 1 lstore_0;40 2 lstore_1;41 3 lstore_2;42 4 lstore_3;43 0 fstore_0;44 1 fstore_1;45 2 fstore_2;46 3 fstore_3;47 1 dstore_0;48 2 dstore_1;49 3 dstore_2;4a 4 dstore_3;4b 0 astore_0;4c 1 astore_1;4d 2 astore_2;4e 3 astore_3;4f - iastore;50 - lastore;51 - fastore;52 - dastore;53 - aastore;54 - bastore;55 - castore;56 - sastore;57 - pop;58 - pop2;59 - dup;5a - dup_x1;5b - dup_x2;5c - dup2;5d - dup2_x1;5e - dup2_x2;5f - swap;60 - iadd;61 - ladd;62 - fadd;63 - dadd;64 - isub;65 - lsub;66 - fsub;67 - dsub;68 - imul;69 - lmul;6a - fmul;6b - dmul;6c - idiv;6d - ldiv;6e - fdiv;6f - ddiv;70 - irem;71 - lrem;72 - frem;73 - drem;74 - ineg;75 - lneg;76 - fneg;77 - dneg;78 - ishl;79 - lshl;7a - ishr;7b - lshr;7c - iushr;7d - lushr;7e - iand;7f - land;80 - ior;81 - lor;82 - ixor;83 - lxor;84 l iinc;85 - i2l;86 - i2f;87 - i2d;88 - l2i;89 - l2f;8a - l2d;8b - f2i;8c - f2l;8d - f2d;8e - d2i;8f - d2l;90 - d2f;91 - i2b;92 - i2c;93 - i2s;94 - lcmp;95 - fcmpl;96 - fcmpg;97 - dcmpl;98 - dcmpg;99 b ifeq;9a b ifne;9b b iflt;9c b ifge;9d b ifgt;9e b ifle;9f b if_icmpeq;a0 b if_icmpne;a1 b if_icmplt;a2 b if_icmpge;a3 b if_icmpgt;a4 b if_icmple;a5 b if_acmpeq;a6 b if_acmpne;a7 b goto;a8 b jsr;a9 l ret;aa T tableswitch;ab U lookupswitch;ac - ireturn;ad - lreturn;ae - freturn;af - dreturn;b0 - areturn;b1 - return;b2 p:f getstatic;b3 p:f putstatic;b4 p:f getfield;b5 p:f putfield;b6 p:m invokevirtual;b7 p:m invokespecial;b8 p:m invokestatic;b9 I:i invokeinterface;bb p:c new;bc y newarray;bd p:c anewarray;be - arraylength;bf - athrow;c0 p:c checkcast;c1 p:c instanceof;c2 - monitorenter;c3 - monitorexit;c4 W wide;c5 M:c multianewarray;c6 b ifnull;c7 b ifnonnull;c8 c goto_w;c9 c jsr_w;"

    .line 621
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Character;->digit(CI)I

    move-result v2

    shl-int/lit8 v2, v2, 0x4

    add-int/lit8 v4, v0, 0x1

    .line 622
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4, v3}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    or-int/2addr v2, v4

    add-int/lit8 v4, v0, 0x3

    .line 624
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2d

    const/16 v6, 0x6d

    const/16 v7, 0x63

    const/16 v8, 0x49

    if-eq v4, v5, :cond_a

    if-eq v4, v8, :cond_9

    const/16 v5, 0x57

    if-eq v4, v5, :cond_8

    const/16 v5, 0x70

    if-eq v4, v5, :cond_7

    const/16 v5, 0x79

    if-eq v4, v5, :cond_6

    const/16 v5, 0x4c

    if-eq v4, v5, :cond_5

    const/16 v5, 0x4d

    if-eq v4, v5, :cond_4

    const/16 v5, 0x62

    if-eq v4, v5, :cond_3

    if-eq v4, v7, :cond_2

    const/16 v5, 0x6c

    if-eq v4, v5, :cond_1

    if-eq v4, v6, :cond_0

    packed-switch v4, :pswitch_data_0

    packed-switch v4, :pswitch_data_1

    const/4 v3, 0x0

    goto :goto_1

    :pswitch_0
    const/4 v3, 0x6

    goto :goto_1

    :pswitch_1
    const/4 v3, 0x5

    goto :goto_1

    :pswitch_2
    const/4 v3, 0x4

    goto :goto_1

    :pswitch_3
    const/4 v3, 0x3

    goto :goto_1

    :pswitch_4
    const/4 v3, 0x2

    goto :goto_1

    :pswitch_5
    const/16 v3, 0x11

    goto :goto_1

    :pswitch_6
    const/16 v3, 0xf

    goto :goto_1

    :cond_0
    const/16 v3, 0xb

    goto :goto_1

    :cond_1
    const/16 v3, 0xa

    goto :goto_1

    :cond_2
    const/16 v3, 0x8

    goto :goto_1

    :cond_3
    const/4 v3, 0x7

    goto :goto_1

    :cond_4
    const/16 v3, 0x12

    goto :goto_1

    :cond_5
    const/16 v3, 0xe

    goto :goto_1

    :cond_6
    const/16 v3, 0xc

    goto :goto_1

    :cond_7
    const/16 v3, 0x9

    goto :goto_1

    :cond_8
    const/16 v3, 0x13

    goto :goto_1

    :cond_9
    const/16 v3, 0xd

    goto :goto_1

    :cond_a
    const/4 v3, 0x1

    :goto_1
    :pswitch_7
    add-int/lit8 v4, v0, 0x5

    add-int/lit8 v0, v0, 0x4

    .line 688
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v5, 0x3a

    if-ne v0, v5, :cond_14

    .line 691
    :goto_2
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v5, 0x44

    if-eq v0, v5, :cond_13

    const/16 v5, 0x46

    if-eq v0, v5, :cond_12

    if-eq v0, v7, :cond_11

    const/16 v5, 0x66

    if-eq v0, v5, :cond_10

    const/16 v5, 0x69

    if-eq v0, v5, :cond_f

    if-eq v0, v6, :cond_e

    const/16 v5, 0x73

    if-eq v0, v5, :cond_d

    if-eq v0, v8, :cond_c

    const/16 v5, 0x4a

    if-eq v0, v5, :cond_b

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_b
    or-int/lit16 v0, v3, 0x80

    goto :goto_3

    :cond_c
    or-int/lit8 v0, v3, 0x20

    goto :goto_3

    :cond_d
    or-int/lit16 v0, v3, 0x400

    goto :goto_3

    :cond_e
    or-int/lit16 v0, v3, 0x1000

    goto :goto_3

    :cond_f
    or-int/lit16 v0, v3, 0x2000

    goto :goto_3

    :cond_10
    or-int/lit16 v0, v3, 0x800

    goto :goto_3

    :cond_11
    or-int/lit16 v0, v3, 0x200

    goto :goto_3

    :cond_12
    or-int/lit8 v0, v3, 0x40

    goto :goto_3

    :cond_13
    or-int/lit16 v0, v3, 0x100

    :goto_3
    move v3, v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_14
    :goto_4
    const/16 v0, 0x3b

    .line 727
    invoke-virtual {v1, v0, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 728
    sget-object v5, Ll/ܶܽܺ;->֫:[I

    aput v3, v5, v2

    .line 729
    sget-object v3, Ll/ܶܽܺ;->ۧ:[Ljava/lang/String;

    invoke-virtual {v1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v2

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_15
    return-void

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x53
        :pswitch_6
        :pswitch_7
        :pswitch_5
    .end packed-switch
.end method

.method public static ֫(I)V
    .locals 1

    .line 765
    sget-object v0, Ll/ܶܽܺ;->֫:[I

    aget p0, v0, p0

    return-void
.end method

.method public static ۧ(I)Ljava/lang/String;
    .locals 3

    .line 748
    sget-object v0, Ll/ܶܽܺ;->ۧ:[Ljava/lang/String;

    aget-object v1, v0, p0

    if-nez v1, :cond_0

    .line 751
    invoke-static {p0}, Ll/ܳᩴܺ;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "unused_"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 752
    aput-object v1, v0, p0

    :cond_0
    return-object v1
.end method
