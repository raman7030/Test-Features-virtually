.class public final Ll/ۧܿ֨;
.super Ljava/lang/Object;
.source "Q3ZI"


# static fields
.field public static final ֫:Ljava/util/EnumSet;

.field public static final ۧ:Ljava/util/EnumSet;

.field public static final ܽ:Ljava/util/EnumSet;

.field public static final ܿ:Ljava/util/EnumSet;

.field public static final ᩳ:Ljava/util/EnumSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 39
    sget-object v0, Ll/֫ܿ֨;->ۧ֫:Ll/֫ܿ֨;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Ll/ۧܿ֨;->ܿ:Ljava/util/EnumSet;

    .line 121
    sget-object v0, Ll/֫ܿ֨;->ۗ:Ll/֫ܿ֨;

    sget-object v1, Ll/֫ܿ֨;->ܺ֫:Ll/֫ܿ֨;

    sget-object v2, Ll/֫ܿ֨;->۬:Ll/֫ܿ֨;

    sget-object v3, Ll/֫ܿ֨;->۫:Ll/֫ܿ֨;

    invoke-static {v0, v1, v2, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Ll/ۧܿ֨;->֫:Ljava/util/EnumSet;

    .line 130
    sget-object v0, Ll/֫ܿ֨;->ܰ:Ll/֫ܿ֨;

    sget-object v1, Ll/֫ܿ֨;->ۨ:Ll/֫ܿ֨;

    sget-object v2, Ll/֫ܿ֨;->ۛ:Ll/֫ܿ֨;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Ll/ۧܿ֨;->ۧ:Ljava/util/EnumSet;

    .line 136
    sget-object v0, Ll/֫ܿ֨;->ܿ֫:Ll/֫ܿ֨;

    sget-object v1, Ll/֫ܿ֨;->ᩳ֫:Ll/֫ܿ֨;

    sget-object v2, Ll/֫ܿ֨;->ܳ֫:Ll/֫ܿ֨;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Ll/ۧܿ֨;->ܽ:Ljava/util/EnumSet;

    .line 142
    sget-object v0, Ll/֫ܿ֨;->᩷֫:Ll/֫ܿ֨;

    sget-object v1, Ll/֫ܿ֨;->ۜ֫:Ll/֫ܿ֨;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Ll/ۧܿ֨;->ᩳ:Ljava/util/EnumSet;

    return-void
.end method

.method public static ֫()Ljava/lang/String;
    .locals 3

    .line 203
    sget-object v0, Ll/ۧܿ֨;->ܿ:Ljava/util/EnumSet;

    .line 204
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩺ᩳ֨;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/᩺ᩳ֨;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    const-string v1, ", "

    invoke-static {v1}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "[ %s ]"

    .line 203
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/util/EnumSet;)V
    .locals 1

    .line 168
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܿ֨;

    .line 169
    invoke-static {v0}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/֫ܿ֨;)V
    .locals 1

    .line 149
    sget-object v0, Ll/֫ܿ֨;->ܺ֫:Ll/֫ܿ֨;

    if-ne p0, v0, :cond_0

    const/16 v0, 0x1b

    .line 150
    sput v0, Ll/ۢܽ֨;->᩶֫:I

    .line 152
    :cond_0
    sget-object v0, Ll/ۧܿ֨;->ܿ:Ljava/util/EnumSet;

    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static varargs ֫([Ll/֫ܿ֨;)Z
    .locals 5

    .line 194
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    .line 195
    sget-object v4, Ll/ۧܿ֨;->ܿ:Ljava/util/EnumSet;

    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static ۧ()Ljava/lang/String;
    .locals 3

    .line 44
    sget-object v0, Ll/ۧܿ֨;->ܿ:Ljava/util/EnumSet;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۨᩳ֨;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۨᩳ֨;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    const-string v1, "\n"

    .line 45
    invoke-static {v1}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public static ۧ(Ll/֫ܿ֨;)V
    .locals 2

    .line 180
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1

    const/16 v1, 0x16

    if-ne v0, v1, :cond_0

    .line 183
    sget-object p0, Ll/ۧܿ֨;->ۧ:Ljava/util/EnumSet;

    invoke-static {p0}, Ll/ۧܿ֨;->֫(Ljava/util/EnumSet;)V

    return-void

    .line 184
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    const-string v1, " ia not group option"

    .line 0
    invoke-static {p0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 184
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 181
    :cond_1
    sget-object p0, Ll/ۧܿ֨;->ᩳ:Ljava/util/EnumSet;

    invoke-static {p0}, Ll/ۧܿ֨;->֫(Ljava/util/EnumSet;)V

    return-void

    .line 182
    :cond_2
    sget-object p0, Ll/ۧܿ֨;->ܽ:Ljava/util/EnumSet;

    invoke-static {p0}, Ll/ۧܿ֨;->֫(Ljava/util/EnumSet;)V

    return-void
.end method

.method public static ܽ()V
    .locals 1

    .line 189
    sget-object v0, Ll/ۧܿ֨;->ܿ:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 190
    sget-object v0, Ll/֫ܿ֨;->ۧ֫:Ll/֫ܿ֨;

    invoke-static {v0}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    return-void
.end method

.method public static ᩳ()V
    .locals 2

    .line 163
    sget-object v0, Ll/ۧܿ֨;->֫:Ljava/util/EnumSet;

    invoke-static {v0}, Ll/ۧܿ֨;->֫(Ljava/util/EnumSet;)V

    .line 164
    sget-object v0, Ll/֫ܿ֨;->ۧ֫:Ll/֫ܿ֨;

    .line 156
    sget-object v1, Ll/֫ܿ֨;->ܺ֫:Ll/֫ܿ֨;

    if-ne v0, v1, :cond_0

    const/16 v1, 0x19

    .line 157
    sput v1, Ll/ۢܽ֨;->᩶֫:I

    .line 159
    :cond_0
    sget-object v1, Ll/ۧܿ֨;->ܿ:Ljava/util/EnumSet;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    return-void
.end method
