.class public final Ll/᩵ۚۘ;
.super Ll/ܿۚۘ;
.source "X88W"


# instance fields
.field public final ۡ:I

.field public final ۢ:I

.field public final ܺ:Ll/ܳۚۘ;

.field public final ᩷:Ll/ܳۚۘ;


# direct methods
.method public constructor <init>(Ll/ܳۚۘ;Ll/ܳۚۘ;)V
    .locals 2

    .line 122
    invoke-direct {p0}, Ll/ܿۚۘ;-><init>()V

    .line 123
    sget-object v0, Ll/ۜۚۘ;->۬:Ll/ۜۚۘ;

    invoke-virtual {p0, v0}, Ll/ܿۚۘ;->֫(Ll/ۜۚۘ;)V

    .line 124
    sget-object v0, Ll/᩷ۚۘ;->ۗ:Ll/᩷ۚۘ;

    sget-object v1, Ll/᩷ۚۘ;->۬:Ll/᩷ۚۘ;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܿۚۘ;->֫(Ljava/util/EnumSet;)V

    const/16 v0, 0x48

    .line 125
    invoke-virtual {p0, v0}, Ll/ܿۚۘ;->֫(S)V

    const/16 v0, 0x4000

    .line 126
    iput v0, p0, Ll/᩵ۚۘ;->ۡ:I

    .line 127
    iput v0, p0, Ll/᩵ۚۘ;->ۢ:I

    .line 128
    iput-object p1, p0, Ll/᩵ۚۘ;->᩷:Ll/ܳۚۘ;

    .line 129
    iput-object p2, p0, Ll/᩵ۚۘ;->ܺ:Ll/ܳۚۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۖۚۘ;)V
    .locals 2

    .line 134
    invoke-super {p0, p1}, Ll/ܿۚۘ;->֫(Ll/ۖۚۘ;)V

    .line 135
    iget v0, p0, Ll/᩵ۚۘ;->ۡ:I

    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ܽ(I)V

    .line 136
    iget v0, p0, Ll/᩵ۚۘ;->ۢ:I

    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ܽ(I)V

    const/4 v0, 0x0

    .line 137
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ۧ(I)V

    const/4 v1, 0x1

    .line 139
    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->֫(I)V

    .line 140
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->֫(I)V

    .line 141
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ܽ(I)V

    .line 143
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ܽ(I)V

    .line 144
    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->֫(I)V

    .line 145
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->֫(I)V

    .line 146
    iget-object v0, p0, Ll/᩵ۚۘ;->᩷:Ll/ܳۚۘ;

    invoke-virtual {v0}, Ll/ܳۚۘ;->᩻()[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->֫([B)V

    .line 147
    invoke-virtual {v0}, Ll/ܳۚۘ;->֫()S

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->ܽ(I)V

    .line 148
    invoke-virtual {v0}, Ll/ܳۚۘ;->ۧ()S

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ܽ(I)V

    .line 149
    iget-object v0, p0, Ll/᩵ۚۘ;->ܺ:Ll/ܳۚۘ;

    invoke-virtual {v0}, Ll/ܳۚۘ;->᩻()[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->֫([B)V

    .line 150
    invoke-virtual {v0}, Ll/ܳۚۘ;->֫()S

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->ܽ(I)V

    .line 151
    invoke-virtual {v0}, Ll/ܳۚۘ;->ۧ()S

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ܽ(I)V

    return-void
.end method
