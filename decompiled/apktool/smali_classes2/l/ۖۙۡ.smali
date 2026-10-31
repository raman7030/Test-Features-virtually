.class public final Ll/ۖۙۡ;
.super Ljava/lang/Object;
.source "41UK"

# interfaces
.implements Ll/ۛ᩶ۡ;


# instance fields
.field public ֫:Ll/ۘۙۡ;

.field public final synthetic ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۙۡ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 133
    new-instance v0, Ll/ۘۙۡ;

    invoke-direct {v0}, Ll/ۘۙۡ;-><init>()V

    iput-object v0, p0, Ll/ۖۙۡ;->֫:Ll/ۘۙۡ;

    .line 134
    iput-object p1, v0, Ll/ۘۙۡ;->ᩳ:Ljava/lang/String;

    .line 135
    iput-object p2, v0, Ll/ۘۙۡ;->ܽ:Ljava/lang/String;

    .line 136
    iget-object p1, p0, Ll/ۖۙۡ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 150
    new-instance v0, Ll/᩵ۙۡ;

    invoke-direct {v0}, Ll/᩵ۙۡ;-><init>()V

    .line 151
    iput-object p1, v0, Ll/᩵ۙۡ;->֫:Ljava/lang/String;

    .line 152
    iput-object p2, v0, Ll/᩵ۙۡ;->ܽ:Ljava/lang/String;

    .line 153
    iput-object p3, v0, Ll/᩵ۙۡ;->ۧ:Ljava/lang/String;

    .line 154
    iget-object p1, p0, Ll/ۖۙۡ;->֫:Ll/ۘۙۡ;

    iget-object p1, p1, Ll/ۘۙۡ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 141
    new-instance v0, Ll/ᩴۙۡ;

    invoke-direct {v0}, Ll/ᩴۙۡ;-><init>()V

    .line 142
    iput-object p1, v0, Ll/ᩴۙۡ;->֫:Ljava/lang/String;

    .line 143
    iput-object p2, v0, Ll/ᩴۙۡ;->ܽ:Ljava/lang/String;

    .line 144
    iput-object p3, v0, Ll/ᩴۙۡ;->ۧ:Ljava/lang/String;

    .line 145
    iget-object p1, p0, Ll/ۖۙۡ;->֫:Ll/ۘۙۡ;

    iget-object p1, p1, Ll/ۘۙۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
