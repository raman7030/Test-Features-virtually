.class public final Ll/ۨܺ۠;
.super Ljava/lang/Object;
.source "H7RN"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final ᩸:Ljava/text/Collator;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1001
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0}, Ljava/text/Collator;->getInstance(Ljava/util/Locale;)Ljava/text/Collator;

    move-result-object v0

    iput-object v0, p0, Ll/ۨܺ۠;->᩸:Ljava/text/Collator;

    const/4 v1, 0x0

    .line 1002
    invoke-virtual {v0, v1}, Ljava/text/Collator;->setStrength(I)V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1000
    check-cast p1, Ll/֡ۖ۠;

    check-cast p2, Ll/֡ۖ۠;

    .line 1006
    iget-object p1, p1, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    iget-object p2, p2, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    iget-object v0, p0, Ll/ۨܺ۠;->᩸:Ljava/text/Collator;

    invoke-virtual {v0, p1, p2}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method
