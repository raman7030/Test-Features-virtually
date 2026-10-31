.class public final Ll/ۖܽܿ;
.super Ljava/lang/Object;
.source "469I"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public final synthetic ۧ:Ll/ᩴܽܿ;


# direct methods
.method public constructor <init>(Ll/ᩴܽܿ;)V
    .locals 0

    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܽܿ;->ۧ:Ll/ᩴܽܿ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 14

    .line 159
    iget-object v0, p0, Ll/ۖܽܿ;->֫:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 51
    invoke-static {}, Ll/ۧᩳܽ;->ܽ()Ll/ܿᩳܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ܿᩳܽ;->֫:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳᩳܽ;

    .line 161
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ll/ᩳᩳܽ;->ۧ()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Ll/ۖܽܿ;->֫:Ljava/util/ArrayList;

    .line 162
    invoke-virtual {v0}, Ll/ᩳᩳܽ;->֫()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽᩳܽ;

    .line 163
    iget-object v3, v3, Ll/ܽᩳܽ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 165
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->trimToSize()V

    .line 166
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 168
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    const-string v2, ":"

    .line 169
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 170
    new-instance v3, Ll/֡᩸ۡ;

    invoke-direct {v3}, Ll/֡᩸ۡ;-><init>()V

    .line 171
    iget-object v4, p0, Ll/ۖܽܿ;->ۧ:Ll/ᩴܽܿ;

    invoke-static {v4}, Ll/ᩴܽܿ;->ۜ(Ll/ᩴܽܿ;)Ll/ܺᩳܿ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܺᩳܿ;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 172
    array-length v6, v0

    const/16 v7, 0x21

    const/4 v8, -0x1

    const/4 v9, 0x1

    if-ne v6, v9, :cond_4

    .line 173
    invoke-virtual {v5, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v8, :cond_2

    .line 175
    new-instance v6, Landroid/text/SpannableString;

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v6, v10}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 176
    invoke-static {v4}, Ll/ᩴܽܿ;->ᩳ(Ll/ᩴܽܿ;)Landroid/text/style/ForegroundColorSpan;

    move-result-object v10

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v11

    add-int/2addr v11, v0

    invoke-virtual {v6, v10, v0, v11, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 177
    invoke-virtual {v3, v6, v1}, Ll/֡᩸ۡ;->֫(Landroid/text/SpannableString;I)V

    .line 179
    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v9

    .line 180
    iget-object v6, p0, Ll/ۖܽܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 181
    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    if-eq v10, v8, :cond_3

    .line 183
    new-instance v11, Landroid/text/SpannableString;

    .line 0
    invoke-static {v5, v2, v9}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 183
    invoke-direct {v11, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 184
    invoke-static {v4}, Ll/ᩴܽܿ;->ᩳ(Ll/ᩴܽܿ;)Landroid/text/style/ForegroundColorSpan;

    move-result-object v9

    add-int v12, v0, v10

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v13

    add-int/2addr v13, v12

    invoke-virtual {v11, v9, v12, v13, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 185
    invoke-virtual {v3, v11, v10}, Ll/֡᩸ۡ;->֫(Landroid/text/SpannableString;I)V

    goto :goto_1

    :cond_4
    const/4 v6, 0x1

    .line 188
    aget-object v9, v0, v1

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 189
    aget-object p1, v0, v6

    .line 190
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 191
    iget-object v6, p0, Ll/ۖܽܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 192
    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    if-eq v10, v8, :cond_5

    .line 194
    new-instance v11, Landroid/text/SpannableString;

    .line 0
    invoke-static {v5, v2, v9}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 194
    invoke-direct {v11, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 195
    invoke-static {v4}, Ll/ᩴܽܿ;->ᩳ(Ll/ᩴܽܿ;)Landroid/text/style/ForegroundColorSpan;

    move-result-object v9

    add-int v12, v0, v10

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v13

    add-int/2addr v13, v12

    invoke-virtual {v11, v9, v1, v13, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 196
    invoke-virtual {v3, v11, v10}, Ll/֡᩸ۡ;->֫(Landroid/text/SpannableString;I)V

    goto :goto_2

    .line 200
    :cond_6
    invoke-static {v4}, Ll/ᩴܽܿ;->᩻(Ll/ᩴܽܿ;)Ll/ܶܽܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 201
    invoke-static {v4}, Ll/ᩴܽܿ;->᩻(Ll/ᩴܽܿ;)Ll/ܶܽܿ;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/֡᩸ۡ;->֫(Ljava/util/ArrayList;)V

    .line 202
    invoke-static {v4}, Ll/ᩴܽܿ;->᩻(Ll/ᩴܽܿ;)Ll/ܶܽܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_7

    invoke-static {v4}, Ll/ᩴܽܿ;->᩻(Ll/ᩴܽܿ;)Ll/ܶܽܿ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/SpannableString;

    invoke-virtual {v0}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 203
    invoke-static {v4}, Ll/ᩴܽܿ;->᩻(Ll/ᩴܽܿ;)Ll/ܶܽܿ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->clear()V

    :cond_7
    return-void
.end method
