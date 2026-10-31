.class public final Ll/᩹ۨܳ;
.super Ll/᩷֨ܳ;
.source "E29Y"


# instance fields
.field public final synthetic ۤ:Ll/ۖۢܳ;

.field public final synthetic ۫:Z

.field public final synthetic ۬:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;ZLl/ܽۢܳ;Ll/ۖۢܳ;)V
    .locals 0

    .line 97
    iput-boolean p2, p0, Ll/᩹ۨܳ;->۫:Z

    iput-object p3, p0, Ll/᩹ۨܳ;->۬:Ll/ܽۢܳ;

    iput-object p4, p0, Ll/᩹ۨܳ;->ۤ:Ll/ۖۢܳ;

    invoke-direct {p0, p1}, Ll/᩷֨ܳ;-><init>(Ll/ۗܺ᩷;)V

    return-void
.end method


# virtual methods
.method public final ۘ()V
    .locals 15

    .line 101
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ܽ()Ll/ۜ֨ܳ;

    move-result-object v2

    .line 102
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ۜ()J

    move-result-wide v5

    const-wide/16 v0, -0x2

    cmp-long v3, v5, v0

    if-nez v3, :cond_0

    .line 104
    invoke-virtual {p0}, Ll/᩷֨ܳ;->᩻()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    const v0, 0x7f1200d9

    .line 105
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    :cond_0
    const-wide/16 v0, -0x1

    cmp-long v3, v5, v0

    if-eqz v3, :cond_2

    const-wide/32 v0, 0x10000

    cmp-long v4, v5, v0

    if-gez v4, :cond_2

    .line 108
    sget-object v0, Ll/ۜ֨ܳ;->ᩳ֫:Ll/ۜ֨ܳ;

    if-eq v2, v0, :cond_1

    sget-object v0, Ll/ۜ֨ܳ;->ۛ:Ll/ۜ֨ܳ;

    if-ne v2, v0, :cond_2

    .line 109
    :cond_1
    invoke-virtual {p0}, Ll/᩷֨ܳ;->᩻()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    const v0, 0x7f1200d7

    .line 110
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 113
    :cond_2
    iget-boolean v0, p0, Ll/᩹ۨܳ;->۫:Z

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ll/᩷֨ܳ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    .line 114
    :goto_0
    iget-object v11, p0, Ll/᩹ۨܳ;->ۤ:Ll/ۖۢܳ;

    if-eqz v0, :cond_4

    iget-object v1, p0, Ll/᩹ۨܳ;->۬:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ۚ()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    invoke-virtual {v11}, Ll/ۖۢܳ;->᩻()Ljava/lang/String;

    move-result-object v1

    .line 115
    :goto_1
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ۢ()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 116
    invoke-virtual {p0}, Ll/᩷֨ܳ;->֫()V

    .line 117
    sget-object v3, Ll/ۜ֨ܳ;->ᩳ֫:Ll/ۜ֨ܳ;

    const-string v4, "splitSize"

    const-string v7, "password"

    const-string v8, "deleteSources"

    const-string v9, "level"

    const-string v10, "outputDir"

    if-ne v2, v3, :cond_5

    .line 118
    sget v2, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v2, Ll/֨۠ۢ;

    const-class v3, Ll/ܽ᩺ܳ;

    invoke-direct {v2, v3}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 119
    invoke-virtual {v11}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    .line 120
    invoke-virtual {v2, v10, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v7, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    invoke-virtual {p0}, Ll/᩷֨ܳ;->᩷()I

    move-result v1

    invoke-virtual {v2, v1, v9}, Ll/֨۠ۢ;->֫(ILjava/lang/String;)V

    .line 123
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ۖ()Z

    move-result v1

    invoke-virtual {v2, v8, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 124
    invoke-virtual {v2, v5, v6, v4}, Ll/֨۠ۢ;->֫(JLjava/lang/String;)V

    .line 118
    invoke-static {v2, v11, v0}, Ll/᩻᩺ܳ;->֫(Ll/֨۠ۢ;Ll/ۖۢܳ;Z)V

    return-void

    .line 125
    :cond_5
    sget-object v3, Ll/ۜ֨ܳ;->ۛ:Ll/ۜ֨ܳ;

    if-ne v2, v3, :cond_6

    .line 126
    sget v2, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v2, Ll/֨۠ۢ;

    const-class v3, Ll/۬ۨܳ;

    invoke-direct {v2, v3}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 127
    invoke-virtual {v11}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    .line 128
    invoke-virtual {v2, v10, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v7, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ܳ()I

    move-result v1

    invoke-virtual {v2, v1, v9}, Ll/֨۠ۢ;->֫(ILjava/lang/String;)V

    const-string v1, "headerEncryption"

    .line 131
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ܺ()Z

    move-result v3

    invoke-virtual {v2, v1, v3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 132
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ۖ()Z

    move-result v1

    invoke-virtual {v2, v8, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 133
    invoke-virtual {v2, v5, v6, v4}, Ll/֨۠ۢ;->֫(JLjava/lang/String;)V

    .line 126
    invoke-static {v2, v11, v0}, Ll/᩻᩺ܳ;->֫(Ll/֨۠ۢ;Ll/ۖۢܳ;Z)V

    return-void

    .line 135
    :cond_6
    sget v3, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v3, Ll/֨۠ۢ;

    const-class v4, Ll/᩺ۨܳ;

    invoke-direct {v3, v4}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 136
    invoke-virtual {v11}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    .line 137
    invoke-virtual {v3, v10, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "format"

    .line 138
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v3, v2, v1}, Ll/֨۠ۢ;->֫(ILjava/lang/String;)V

    .line 139
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ᩳ()I

    move-result v1

    invoke-virtual {v3, v1, v9}, Ll/֨۠ۢ;->֫(ILjava/lang/String;)V

    .line 140
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ۖ()Z

    move-result v1

    invoke-virtual {v3, v8, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 135
    invoke-static {v3, v11, v0}, Ll/᩻᩺ܳ;->֫(Ll/֨۠ۢ;Ll/ۖۢܳ;Z)V

    return-void

    .line 143
    :cond_7
    invoke-virtual {p0}, Ll/᩷֨ܳ;->ۧ()Ljava/lang/String;

    move-result-object v4

    const-string v7, "/"

    if-eqz v0, :cond_8

    .line 144
    invoke-virtual {v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    const/4 v0, 0x1

    const/4 v8, 0x1

    goto :goto_2

    :cond_8
    const/4 v0, 0x0

    const/4 v8, 0x0

    .line 146
    :goto_2
    invoke-virtual {v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    new-array v0, v10, [Ljava/lang/String;

    invoke-static {v4, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    goto :goto_3

    :cond_9
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    :goto_3
    move-object v4, v0

    if-eqz v3, :cond_a

    .line 148
    sget-object v0, Ll/ۜ֨ܳ;->ۛ:Ll/ۜ֨ܳ;

    if-ne v2, v0, :cond_a

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".001"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v10, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    move-object v12, v0

    goto :goto_4

    :cond_a
    move-object v12, v4

    .line 151
    :goto_4
    invoke-virtual {v12}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v13

    .line 152
    new-instance v14, Ll/᩸ۨܳ;

    move-object v0, v14

    move-object v1, p0

    move-object v3, v11

    move v7, v13

    invoke-direct/range {v0 .. v8}, Ll/᩸ۨܳ;-><init>(Ll/᩹ۨܳ;Ll/ۜ֨ܳ;Ll/ۖۢܳ;Ll/ܶ᩵ܿ;JZZ)V

    if-eqz v13, :cond_d

    .line 210
    invoke-virtual {v12}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-nez v0, :cond_c

    .line 187
    invoke-virtual {v12}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_b

    const v0, 0x7f1208c2

    goto :goto_5

    :cond_b
    const v0, 0x7f1208c1

    :goto_5
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 191
    :cond_c
    invoke-virtual {v11}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120b7b

    .line 192
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 193
    invoke-virtual {v11}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {v12}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    new-array v3, v9, [Ljava/lang/Object;

    aput-object v2, v3, v10

    const v2, 0x7f1203b5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/ᩳۨ᩷;

    invoke-direct {v1, v9, v14}, Ll/ᩳۨ᩷;-><init>(ILjava/lang/Object;)V

    const v2, 0x7f12070a

    .line 194
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12015e

    const/4 v2, 0x0

    .line 195
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 196
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 198
    :cond_d
    invoke-virtual {v14}, Ll/᩸ۨܳ;->run()V

    return-void
.end method
