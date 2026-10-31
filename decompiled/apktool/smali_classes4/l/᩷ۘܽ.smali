.class public final Ll/᩷ۘܽ;
.super Ljava/lang/Object;
.source "M1FH"


# static fields
.field public static ܽ:Ljava/util/regex/Pattern;


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "\\s*"

    .line 17
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩷ۘܽ;->ܽ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;)Ll/᩷ۘܽ;
    .locals 17

    .line 48
    new-instance v0, Ll/۟ۖܽ;

    invoke-direct {v0}, Ll/۟ۖܽ;-><init>()V

    .line 49
    new-instance v1, Ll/۬ۡ֡;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Ll/۬ۡ֡;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v1}, Ll/۟ۖܽ;->֫(Ljava/io/Reader;)V

    .line 54
    new-instance v1, Ll/᩷ۘܽ;

    .line 103
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ll/᩷ۘܽ;->֫:Ljava/util/ArrayList;

    .line 25
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ll/᩷ۘܽ;->ۧ:Ljava/util/ArrayList;

    .line 56
    new-instance v2, Ljava/util/Stack;

    invoke-direct {v2}, Ljava/util/Stack;-><init>()V

    .line 57
    new-instance v3, Ljava/util/Stack;

    invoke-direct {v3}, Ljava/util/Stack;-><init>()V

    .line 58
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ll/۟ۖܽ;->ۖ()I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_7

    const/4 v6, 0x2

    if-eq v4, v6, :cond_3

    const/4 v5, 0x3

    if-eq v4, v5, :cond_2

    const/4 v5, 0x4

    if-eq v4, v5, :cond_1

    goto :goto_0

    .line 89
    :cond_1
    invoke-virtual {v0}, Ll/۟ۖܽ;->ܺ()Ljava/lang/String;

    move-result-object v4

    .line 90
    sget-object v6, Ll/᩷ۘܽ;->ܽ:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    if-nez v6, :cond_0

    .line 91
    new-instance v6, Ll/ۜۘܽ;

    invoke-virtual {v0}, Ll/۟ۖܽ;->᩷()I

    move-result v7

    invoke-direct {v6, v4, v7}, Ll/ۜۘܽ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v5, v6}, Ll/᩷ۘܽ;->֫(ILjava/lang/Object;)V

    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v6, v4}, Ll/᩷ۘܽ;->֫(ILjava/lang/Object;)V

    .line 84
    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    .line 85
    invoke-static {v4}, Ll/۟۫ܺ;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩻ۘܽ;

    .line 86
    invoke-virtual {v1, v5, v6}, Ll/᩷ۘܽ;->֫(ILjava/lang/Object;)V

    goto :goto_1

    .line 61
    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 62
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 63
    :goto_2
    invoke-virtual {v0}, Ll/۟ۖܽ;->֫()I

    move-result v9

    if-ge v8, v9, :cond_5

    .line 64
    invoke-virtual {v0, v8}, Ll/۟ۖܽ;->֫(I)Ljava/lang/String;

    move-result-object v13

    .line 65
    invoke-virtual {v0, v8}, Ll/۟ۖܽ;->ᩳ(I)Ljava/lang/String;

    move-result-object v12

    .line 66
    invoke-virtual {v0, v8}, Ll/۟ۖܽ;->ܿ(I)Ljava/lang/String;

    move-result-object v14

    const-string v9, "xmlns"

    .line 67
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 68
    new-instance v9, Ll/᩻ۘܽ;

    invoke-virtual {v0, v8}, Ll/۟ۖܽ;->ܳ(I)Ll/ܽۘܽ;

    move-result-object v10

    invoke-virtual {v10}, Ll/ܽۘܽ;->ᩳ()I

    move-result v10

    invoke-direct {v9, v10, v13, v14}, Ll/᩻ۘܽ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 70
    :cond_4
    new-instance v9, Ll/ܿۘܽ;

    invoke-virtual {v0, v8}, Ll/۟ۖܽ;->ܽ(I)Ljava/lang/String;

    move-result-object v11

    .line 71
    invoke-virtual {v0, v8}, Ll/۟ۖܽ;->ۧ(I)Ll/ܽۘܽ;

    move-result-object v10

    invoke-virtual {v10}, Ll/ܽۘܽ;->clone()Ll/ܽۘܽ;

    move-result-object v15

    invoke-virtual {v0, v8}, Ll/۟ۖܽ;->ܳ(I)Ll/ܽۘܽ;

    move-result-object v10

    invoke-virtual {v10}, Ll/ܽۘܽ;->clone()Ll/ܽۘܽ;

    move-result-object v16

    move-object v10, v9

    invoke-direct/range {v10 .. v16}, Ll/ܿۘܽ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܽۘܽ;Ll/ܽۘܽ;)V

    .line 70
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 74
    :cond_5
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩻ۘܽ;

    .line 75
    invoke-virtual {v1, v7, v9}, Ll/᩷ۘܽ;->֫(ILjava/lang/Object;)V

    goto :goto_4

    .line 76
    :cond_6
    new-instance v7, Ll/ܳۘܽ;

    invoke-virtual {v0}, Ll/۟ۖܽ;->᩻()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Ll/۟ۖܽ;->ܳ()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Ll/۟ۖܽ;->᩷()I

    move-result v10

    invoke-direct {v7, v10, v8, v9, v4}, Ll/ܳۘܽ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 77
    invoke-virtual {v1, v5, v7}, Ll/᩷ۘܽ;->֫(ILjava/lang/Object;)V

    .line 79
    invoke-virtual {v2, v7}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    invoke-virtual {v3, v6}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    return-object v1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 28
    iget-object v0, p0, Ll/᩷ۘܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Ll/ܳۘܽ;
    .locals 1

    .line 40
    iget-object v0, p0, Ll/᩷ۘܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳۘܽ;

    return-object p1
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    .line 99
    iget-object v0, p0, Ll/᩷ۘܽ;->ۧ:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    iget-object p1, p0, Ll/᩷ۘܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(I)Ll/᩻ۘܽ;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/᩷ۘܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ۘܽ;

    return-object p1
.end method

.method public final ܽ(I)Ll/ۜۘܽ;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/᩷ۘܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜۘܽ;

    return-object p1
.end method

.method public final ᩳ(I)I
    .locals 1

    .line 32
    iget-object v0, p0, Ll/᩷ۘܽ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
